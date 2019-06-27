package com.yonyou.singlton;

public class Singleton1 {
	private static Singleton1 s1 = new Singleton1();
	
	private Singleton1(){}
	
	public Singleton1 getInstence(){
		return s1;
	}
}
