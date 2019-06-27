package com.yonyou.builder;

public class Client {
	
	public static void main(String args []){
		BenzCarBuilder benzCar = new BenzCarBuilder();
		BenzCar benz = (BenzCar) benzCar.createCar();
		benz.run();
	}
}
