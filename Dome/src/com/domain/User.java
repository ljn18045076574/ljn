/**
 * @(#)User.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	刘佳楠  2017年12月18日
 */
package com.domain;

/**
 * TODO 填写功能说明
 * @author 刘佳楠
 */
public class User {
	private Integer uno;
	private String uname;
	private String upass;
	private String sex;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uno, String uname, String upass, String sex) {
		super();
		this.uno = uno;
		this.uname = uname;
		this.upass = upass;
		this.sex = sex;
	}
	public Integer getUno() {
		return uno;
	}
	public void setUno(Integer uno) {
		this.uno = uno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
