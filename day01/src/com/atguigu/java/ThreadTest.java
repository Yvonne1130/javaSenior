package com.atguigu.java;

/**
 * @author yvonne
 * @create 2021-10-07 13:00
 */
class MyTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子类的对象
        MyTest t1 = new MyTest();
        t1.start();

        for(int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(i + "********");
        }
    }
}