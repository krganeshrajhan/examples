package example.java.design.patterns.principles.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomDemo {

    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        Person john = new Person("John");
        Person jane = new Person("Jane");

        room.join(john); // no message here
        room.join(jane);

        john.say("hi room");
        jane.say("oh, hey john");

        Person simon = new Person("Simon");
        room.join(simon);
        simon.say("hi everyone!");

        jane.privateMessage("Simon", "glad you could join us!");
    }

}

class ChatRoom {

    List<Person> personList = new ArrayList<>();

    void join(Person person) {
        person.room = this;
        personList.add(person);
    }

    void broadcast(String sender, String message) {
        personList.stream()
                .filter(p -> !p.name.equals(sender))
                .forEach(p -> p.receive(sender, message));
    }

    public void privateMessage(String sender, String personName, String message) {
        personList.stream()
                .filter(p -> p.name.equals(personName))
                .findFirst()
                .ifPresent(person -> person.receive(sender,message));
    }
}

class Person {

    public String name;
    public ChatRoom room;

    Person(String name) {
        this.name = name;
    }

    void say(String message) {
        room.broadcast(name, message);
    }

    void privateMessage(String personName, String message) {
        room.privateMessage(name, personName, message);
    }

    void receive(String sender, String message) {
        System.out.println(name + "'s Chatbox: Sender " + sender + " says " + message);
    }

}
