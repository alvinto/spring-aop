package com.ws.sample;

/**
 * Created by alvin on 2016/5/9.
 */
public class TestForumService {
    public static void main(String[] args) {
        ForumService forumService = new ForumServiceImpl();
        forumService.remove(50);
        forumService.removeForum(10);
    }
}
