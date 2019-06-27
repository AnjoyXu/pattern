package com.yonyou.builder;

/**
 * 
 * @author Administrator
 *
 */
public abstract class Car {
	abstract void start();
	abstract void alarm();
	abstract void stop();
	abstract void enginBoom();
	
	public void run (){
		start();
		enginBoom();
		alarm();
	}
	
}
