/**
 * @(#)User.java
 * Description:	TODO ��д�ļ����ü�Ҫ˵��
 * Version :	0.0.0
 * Copyright:	Copyright (c) �������޶���Ϣ�Ƽ����޹�˾  ��Ȩ����
 * Create by:	�����  2017��12��18��
 */
package com.domain;

/**
 * TODO ��д����˵��
 * @author �����
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
