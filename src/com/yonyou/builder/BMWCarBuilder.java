package com.yonyou.builder;

public class BMWCarBuilder implements CarBuilder{

	private BMWCar car = new BMWCar();
	
	@Override
	public Car createCar() {
		return this.car;
	}
}
