/**
 * @author gongf
 */
package cn.com.action;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.entity.UserTwo;
import cn.com.service.IRegistService;
import cn.com.service.imp.RegistService;
public class RegisterAction extends HttpServlet {


	public IRegistService iRegistService =null;
	public UserTwo user = null;
	public int flag = 0; 
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  user = new UserTwo();
		  user.name = request.getParameter("userName");
		  user.identify = request.getParameter("identify");
		  user.password = request.getParameter("password");
		  user.age = new Integer(request.getParameter("age")) ;
		  user.mobileTel = request.getParameter("mobileTel");
	
		  if(request.getParameter("sex").toString().equals(new String("man")))
		     user.sex = 1;
		  else 
			 user.sex = 0;

            regist(user);
            if(flag == 1){
            	response.setContentType("text/html,utf-8");
            	request.setAttribute("flag", flag);
            	request.getRequestDispatcher("../jsp/regist.jsp").forward(request, response);
//            	response.sendRedirect("../jsp/regist.jsp");
            }
            
	}
	public void regist(UserTwo user){
		  iRegistService = new RegistService();
          flag = iRegistService.regist(user);
	}

	
	
}
