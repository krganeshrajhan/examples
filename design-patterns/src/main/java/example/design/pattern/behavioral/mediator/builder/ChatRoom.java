package example.design.pattern.behavioral.mediator.builder;

import example.design.pattern.behavioral.mediator.user.User;

import java.util.Date;

/**
 * Created by 1532082 on 12/6/2016.
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
