package com.yonyou.singlton;

/**
 * 懒汉单例模式
 * 构造器私有化
 * 私有类
 * 提供一个静态的方法返回对象
 * @author Administrator
 *
 */
public class Singleton2 {
	private Singleton2(){};
	private static Singleton2 s2= null;
	
	public static synchronized Singleton2  getInstance(){
		if(s2 == null){
			s2 = new Singleton2();
		}
		return s2;
	}
}	
