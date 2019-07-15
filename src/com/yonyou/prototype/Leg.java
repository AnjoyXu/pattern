package com.yonyou.prototype;

import java.io.Serializable;

public class Leg implements Serializable{
	
	private String directname;

	public Leg(String name){
		this.directname = name;
	}
	
	public String getDirectname() {
		return directname;
	}

	public void setDirectname(String directname) {
		this.directname = directname;
	}
}
