package example.design.pattern.behavioral.mediator.user;

import example.design.pattern.behavioral.mediator.builder.ChatRoom;

import java.util.Date;

/**
 * Created by 1532082 on 12/6/2016.
 */
public class User {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this,message);
    }
}
