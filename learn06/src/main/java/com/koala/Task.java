package com.koala;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * Created by carl on 16-12-7.
 */

@Component
public class Task {
    public static Random random = new Random();
    @Async
     public Future<String> doTaskOne() throws InterruptedException {
         System.out.println("doTaskOne开始");
         Long start = System.currentTimeMillis();
         Thread.sleep(random.nextInt(10000));
         Long end = System.currentTimeMillis();
         System.out.println("doTaskOne结束用时："+(end-start));
        return  new AsyncResult<>("one已完成");
     }
     @Async
    public Future<String> doTaskTwo() throws InterruptedException {
        System.out.println("doTaskTwo开始");
        Long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        Long end = System.currentTimeMillis();
        System.out.println("doTaskTwo结束用时："+(end-start));
         return  new AsyncResult<>("two已完成");
    }
    @Async
    public Future<String> doTaskThree() throws InterruptedException {
        System.out.println("doTaskThree开始");
        Long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        Long end = System.currentTimeMillis();
        System.out.println("doTaskThree结束用时："+(end-start));
        return  new AsyncResult<>("three已完成");
    }

}
