package example.java.design.patterns.principles.structural.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class User {

    List<String> stringList = new ArrayList<>();
    private int[] names;

    public User(String text) {
        Function<String, Integer> getorAdd = (String s) -> {
            int index = stringList.indexOf(s);
            if (index != -1) {
                return index;
            } else {
                stringList.add(s);
                return s.length()-1;
            }
        };
        names = Arrays.stream(text.split(" "))
                .mapToInt(s -> getorAdd.apply(s)).toArray();
    }

    @Override
    public String toString() {
        return Arrays.stream(names)
                .mapToObj(i -> stringList.get(i))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        User user = new User("hello world");
        User user1 = new User("hi world");
        System.out.println(user);
        System.out.println(user1);

    }
}
