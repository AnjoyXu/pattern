package com.yonyou.singlton;

/**
 * ��������ģʽ
 * ������˽�л�
 * ˽����
 * �ṩһ����̬�ķ������ض���
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
