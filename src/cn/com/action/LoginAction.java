
/**
 * @author gongf
 *
 */
package cn.com.action;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.com.entity.UserTwo;
import cn.com.service.ILoginService;
import cn.com.service.imp.LoginService;


public class LoginAction{
	

@Autowired
public ILoginService iloginService ;
public UserTwo user = null;
public int flag = 0; //ÅÐ¶ÏÊÇ·ñÄÜµÇÂ¼£¬·µ»Ø1ÄÜ£¬0·ñ£»
public String userName = null;
public String userPassword = null;


public String login(){ 
			
    user = new UserTwo();
    user.name = this.userName;
    user.password = this.userPassword;
	HttpServletRequest request = ServletActionContext.getRequest();
	flag = iloginService.login(user);
	if(flag > 0){
	    System.out.println(flag);
	    request.getSession().setAttribute("myname", user.name);
	    return "success";
	}
	else{
		return "error";
	}
	


}




public String getUserName() {
	return userName;
}


public String getUserPassword() {
	return userPassword;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}




}     