package com.atguigu.java;

/**
 * @author yvonne
 * @create 2021-10-07 14:16
 */
class MtThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }

        }
    }
}


public class ThreadTest1 {
    public static void main(String[] args) {
        MtThread mtThread = new MtThread();
        Thread thread = new Thread(mtThread);
        thread.start();
    }
}
