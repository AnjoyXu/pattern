package com.yonyou.singlton;

import java.util.Random;

public class OuterClass {
    public static long OUTER_DATE = System.currentTimeMillis();
    public static int a = 1;
    static {
        System.out.println("外部类静态块加载时间：" + System.currentTimeMillis());
    }

    public OuterClass() {
        timeElapsed();
        System.out.println("外部类构造函数事件：" + System.currentTimeMillis());
    }

    static class InnerStaticClass {
        static {
            System.out.println("内部类静态块加载时间：" + System.currentTimeMillis());
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
        //System.out.println("外部类常量加载时间：" + OuterClass.OUTER_DATE); 
    	OuterClass outer = new OuterClass();
        OuterClass.Hello();
        System.out.println("内部静态类静态变量" + OuterClass.InnerStaticClass.INNER_DATE);
        System.out.println("外部类静态变量加载时间：" + OuterClass.OUTER_DATE);
        System.out.println("外部类静态变量加载时间：" + outer.OUTER_DATE);  
    }

    //单纯的为了耗时而已
    private void timeElapsed() {
        for (int i = 0; i < 10000000; i++) {
            int a = new Random(100).nextInt(), b = new Random(100).nextInt();
            a = a + b;
        }
    }
}