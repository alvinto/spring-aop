package com.ws.sample;

/**
 * Created by alvin on 2016/5/9.
 */
public class ForumServiceImpl implements ForumService {
    @Override
    public void remove(int topicid) {
        PerformanceMonitor.begin("com.ws.sample.ForumServiceImpl.remove");

        //模拟业务代码执行时间
        try {
            Thread.currentThread().sleep(20);
            System.out.println("模拟删除Topic20");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PerformanceMonitor.end();
    }

    @Override
    public void removeForum(int forumid) {
        PerformanceMonitor.begin("com.ws.sample.ForumServiceImpl.removeForum");

        //模拟业务代码执行时间
        try {
            Thread.currentThread().sleep(30);
            System.out.println("模拟删除 Forum 30");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PerformanceMonitor.end();
    }
}
