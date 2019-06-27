package com.yonyou.builder;

public class BMWCar extends Car{

	@Override
	void start() {
		System.out.println("宝马汽车启动");
	}

	@Override
	void alarm() {
		System.out.println("宝马汽车滴滴叫");
	}

	@Override
	void stop() {
		System.out.println("宝马汽车熄火");
	}

	@Override
	void enginBoom() {
		System.out.println("发动机嗡嗡叫");
	}

	
	
}
