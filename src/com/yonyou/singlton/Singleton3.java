package com.yonyou.singlton;

/**
 * ��̬�ڲ���ʵ�ֵ���
 * @author Administrator
 *
 */
public class Singleton3 {
	
	//�����ڲ���
	private static class SingletonClassInstance{
		private static final Singleton3  s3 = new Singleton3();
	}

	//�ṩһ���ӿ�
	public Singleton3 getInstance(){
		return SingletonClassInstance.s3;
	}
	
	//������˽�л�
	private Singleton3(){
		
	}

}
