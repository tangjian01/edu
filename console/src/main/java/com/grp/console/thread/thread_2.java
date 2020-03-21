package com.grp.console.thread;

import com.grp.console.helper.SleepUtils;


public class thread_2 {

    public static void main(String[] args){
        new Thread(new TimeWaiting(),"TimeWaiting-thread").start();
        new Thread(new Waiting(),"waiting-thread").start();

        new Thread(new Block(),"blockthread--1").start();
        new Thread(new Block(),"blockthread--2").start();


    }


    static class TimeWaiting implements Runnable{
        @Override
        public void run() {
            while (true){
                SleepUtils.sleep(100);
            }
        }
    }

    static class Waiting implements Runnable{
        @Override
        public void run() {
            while(true){
                synchronized (Waiting.class){
                    try {
                        Waiting.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Block implements Runnable{
        @Override
        public void run() {
            synchronized (Block.class){
                SleepUtils.sleep(10000);
            }
        }
    }
}
