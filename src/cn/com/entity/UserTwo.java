package cn.com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * @auther gongfei
 */

//ϵͳ�û�
@Entity
public class UserTwo {
	
	@Id
	public int id = 0;
	
	public String name = null; 
	public String identify = null;
	public String password = null;
	public int sex = 0;
	public int age = 0;
	public String mobileTel = null;

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentify() {
		return identify;
	}
	public void setIdentify(String identify) {
		this.identify = identify;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileTel(){
		return mobileTel;
	}
	public void setMobileTel(String mobileTel){
		this.mobileTel = mobileTel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
