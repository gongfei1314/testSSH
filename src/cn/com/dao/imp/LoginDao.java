package cn.com.dao.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import cn.com.dao.ILoginDao;
import cn.com.entity.Person;
import cn.com.entity.Student;
import cn.com.entity.Teacher;
import cn.com.entity.UserTwo;
import cn.com.utills.JDBCObject;

@Repository
public class LoginDao implements ILoginDao {
	
public  Connection conn = null;
public Statement stmt = null;
public PreparedStatement psmt;
public ResultSet rs = null;
public String sql = "select * from user t where ";
public SessionFactory sessionFactory;

	@Override
	public int login(UserTwo user) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from UserTwo where name =? and password = ?");
		query.setString(0, user.name.trim());
		query.setString(1, user.password.trim());
		List<UserTwo> list = query.list();
		tx.commit();
		session.close();
//		sessionFactory.close();
		
		if((null != list)&&list.get(0) != null){
			return 1;
		}
		else
		{
			return 0;
		}
	}

	
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
