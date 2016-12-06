package example.design.pattern.behavioral.mediator;

import example.design.pattern.behavioral.mediator.user.User;

/**
 * Created by 1532082 on 12/6/2016.
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
