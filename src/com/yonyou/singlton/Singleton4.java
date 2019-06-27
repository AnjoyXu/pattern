package com.yonyou.singlton;

/*
 * 通过枚举的方式实现单例
 */
public enum Singleton4 {
	//这个枚举元素本身就是单例 ，唯一缺点没有懒加载
	//避免反射
	INSTANCE;
	
	public void getSingletonInstance(){
		System.out.println("其他操作");
	}
}
