package example.design.pattern.behavioral.nullPattern;

import example.design.pattern.behavioral.nullPattern.builder.AbstractCustomer;
import example.design.pattern.behavioral.nullPattern.factory.CustomerFactory;

/**
 * Created by krganeshrajhan on 11/12/16.
 */
public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
