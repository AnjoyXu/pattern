package com.yonyou.prototype;

import java.io.Serializable;

public class Body implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3222625143304418115L;

	public Body(String name){
		this.name = name;
	}
	
	public Body() {
	}


	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
