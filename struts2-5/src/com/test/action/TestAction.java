package com.test.action;

import java.util.ArrayList;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qr.bean.Em;

public class TestAction extends ActionSupport {
	Em em ; 
	ArrayList ar;
	@Override
	public String execute() throws Exception {
	   ar = new ArrayList();
		ar.add("�Ǻ�1");
		ar.add("�Ǻ�2");
		ar.add("�Ǻ�3");
		System.out.println(em.getUserName());
		return "success";
	}
	public Em getEm() {
		return em;
	}
	public void setEm(Em em) {
		this.em = em;
	}
	public ArrayList getAr() {
		return ar;
	}
	public void setAr(ArrayList ar) {
		this.ar = ar;
	}
	
}
