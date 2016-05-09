package com.ws.cglibproxy;

/**
 * Created by alvin on 2016/5/9.
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl)cglibProxy.getProxy(ForumServiceImpl.class);
        forumService.remove(10);
        forumService.removeForum(20);
    }
}
