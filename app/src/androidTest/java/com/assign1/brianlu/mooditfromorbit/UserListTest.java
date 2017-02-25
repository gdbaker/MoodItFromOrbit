package com.assign1.brianlu.mooditfromorbit;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by brianlu on 2017-02-24.
 */

public class UserListTest extends ActivityInstrumentationTestCase2 {
    public UserListTest(){
        super(MoodMainActivity.class);

    }

    public void testAddTweet(){
        UserList users = new UserList();
        User user = new User("blu1");

        users.add(user);

        assertTrue(users.hasUser(user));
    }

    public void testGetUser(){
        UserList users = new UserList();
        User user = new User("blu1");
        User returnedUser = users.getUser(0);
        assertEquals(returnedUser.getUserName(),user.getUserName());
    }
}