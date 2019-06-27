package com.yonyou.builder;

public class BenzCarBuilder implements CarBuilder{

	private BenzCar car = new BenzCar();
	
	@Override
	public Car createCar() {
		return this.car;
	}

}
