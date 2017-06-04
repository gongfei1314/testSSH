package cn.com.service.imp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import cn.com.dao.ILoginDao;
import cn.com.dao.imp.LoginDao;
import cn.com.entity.UserTwo;
import cn.com.service.ILoginService;


@Repository
public class LoginService implements ILoginService {
	
@Autowired
public ILoginDao loginDao ;
public int flag = 0;
	@Override
	public int login(UserTwo user) {
		
	    flag =	loginDao.login(user);
	    return flag;
		
	}
	

}
