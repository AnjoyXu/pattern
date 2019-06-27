package com.yonyou.singlton;

/**
 * 静态内部类实现单例
 * @author Administrator
 *
 */
public class Singleton3 {
	
	//匿名内部类
	private static class SingletonClassInstance{
		private static final Singleton3  s3 = new Singleton3();
	}

	//提供一个接口
	public Singleton3 getInstance(){
		return SingletonClassInstance.s3;
	}
	
	//构造器私有化
	private Singleton3(){
		
	}

}
