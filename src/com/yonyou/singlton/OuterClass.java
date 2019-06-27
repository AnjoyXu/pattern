package com.yonyou.singlton;

import java.util.Random;

public class OuterClass {
    public static long OUTER_DATE = System.currentTimeMillis();
    public static int a = 1;
    static {
        System.out.println("�ⲿ�ྲ̬�����ʱ�䣺" + System.currentTimeMillis());
    }

    public OuterClass() {
        timeElapsed();
        System.out.println("�ⲿ�๹�캯���¼���" + System.currentTimeMillis());
    }

    static class InnerStaticClass {
        static {
            System.out.println("�ڲ��ྲ̬�����ʱ�䣺" + System.currentTimeMillis());
        }
        public static double INNER_DATE = System.currentTimeMillis();

    }

    class InnerClass {
        public long INNER_DATE = 0;
        public InnerClass() {
            timeElapsed();
            INNER_DATE = System.currentTimeMillis();
        }           
    }

    public static void Hello(){System.out.println("Hello");}

    public static void main(String[] args) {
        //System.out.println("�ⲿ�ೣ������ʱ�䣺" + OuterClass.OUTER_DATE); 
    	OuterClass outer = new OuterClass();
        OuterClass.Hello();
        System.out.println("�ڲ���̬�ྲ̬����" + OuterClass.InnerStaticClass.INNER_DATE);
        System.out.println("�ⲿ�ྲ̬��������ʱ�䣺" + OuterClass.OUTER_DATE);
        System.out.println("�ⲿ�ྲ̬��������ʱ�䣺" + outer.OUTER_DATE);  
    }

    //������Ϊ�˺�ʱ����
    private void timeElapsed() {
        for (int i = 0; i < 10000000; i++) {
            int a = new Random(100).nextInt(), b = new Random(100).nextInt();
            a = a + b;
        }
    }
}