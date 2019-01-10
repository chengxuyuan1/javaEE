package com.jikexueyuan.action;

import com.jikexueyuan.bean.Users;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	//Struts2 valueStack
	private Users us;
	@Override
	public String execute() throws Exception {
		System.out.println(us.getUsername());
		System.out.println(us.getPassword());
		return "success";
	}
	public Users getUs() {
		return us;
	}
	public void setUs(Users us) {
		this.us = us;
	}
	
	
}
