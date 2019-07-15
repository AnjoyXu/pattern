package com.yonyou.prototype;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Sheep implements Cloneable,Serializable{
	private String name;
	private Date birthday;
	
	private Body body;
	private List<Leg> listleg;
	private Map<String,String> map;
	
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public List<Leg> getListleg() {
		return listleg;
	}
	public void setListleg(List<Leg> listleg) {
		this.listleg = listleg;
	}
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}


	private Head head;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		return obj;
	}
	
	
}
