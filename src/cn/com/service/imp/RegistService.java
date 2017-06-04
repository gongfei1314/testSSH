package cn.com.service.imp;

import cn.com.dao.IRegistDao;
import cn.com.dao.imp.RegistDao;
import cn.com.service.IRegistService;
import cn.com.entity.UserTwo;


public class RegistService implements IRegistService {

	public IRegistDao iregistDao = null;
	@Override
	public int regist(UserTwo user) {
		int flag = 0;
		iregistDao = new RegistDao();
		flag =iregistDao.regist(user);
		return flag;
	}


}
