package com.yonyou.builder;

public class BenzCar extends Car{
	public BenzCar (){}
	@Override
	void start() {
		System.out.println("������������");
	}

	@Override
	void alarm() {
		System.out.println("���������εν�");
	}

	@Override
	void stop() {
		System.out.println("��������Ϩ��");
	}

	@Override
	void enginBoom() {
		System.out.println("���������˽�");
	}

	
	
}
