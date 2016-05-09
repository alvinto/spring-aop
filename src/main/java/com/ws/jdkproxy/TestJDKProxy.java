package com.ws.jdkproxy;

/**
 * Created by alvin on 2016/5/9.
 */
public class TestJDKProxy {
    public static void main(String[] args) {
        ForumService forumService = new ForumServiceImpl();
        PerformanceHandle performanceHandle = new PerformanceHandle(forumService);
        ForumService forumServiceProxy = (ForumService)performanceHandle.getTargetObject();
        forumServiceProxy.removeForum(10);
        forumServiceProxy.remove(20);
    }

}
