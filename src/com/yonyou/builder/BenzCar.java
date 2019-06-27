package com.yonyou.builder;

public class BenzCar extends Car{
	public BenzCar (){}
	@Override
	void start() {
		System.out.println("±¼³ÛÆû³µÆô¶¯");
	}

	@Override
	void alarm() {
		System.out.println("±¼³ÛÆû³µµÎµÎ½Ð");
	}

	@Override
	void stop() {
		System.out.println("±¼³ÛÆû³µÏ¨»ð");
	}

	@Override
	void enginBoom() {
		System.out.println("·¢¶¯»úÎËÎË½Ð");
	}

	
	
}
