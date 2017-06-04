package cn.com.dao;

import cn.com.entity.UserTwo;

/**
 * 
 * @author gongf
 * 
 *
 */
//查询库中是否有此用户
public interface ILoginDao {

	public int login(UserTwo user);
}

