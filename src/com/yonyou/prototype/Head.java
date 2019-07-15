package com.yonyou.prototype;

import java.io.Serializable;

public class Head implements Serializable{
	private String name;
	
	public Head(String name){
		this.name = name;
		
	}

	public Head(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
