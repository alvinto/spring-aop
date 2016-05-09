package com.ws.cglibproxy;

/**
 * Created by alvin on 2016/5/9.
 */
public class ForumServiceImpl implements ForumService {
    @Override
    public void remove(int topicid) {

        //模拟业务代码执行时间
        try {
            Thread.currentThread().sleep(20);
            System.out.println("模拟删除Topic20");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void removeForum(int forumid) {

        //模拟业务代码执行时间
        try {
            Thread.currentThread().sleep(30);
            System.out.println("模拟删除 Forum 30");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
