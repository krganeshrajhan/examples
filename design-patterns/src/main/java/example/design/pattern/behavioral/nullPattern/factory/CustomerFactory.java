package example.design.pattern.behavioral.nullPattern.factory;

import example.design.pattern.behavioral.nullPattern.builder.AbstractCustomer;
import example.design.pattern.behavioral.nullPattern.builder.NullCustomer;
import example.design.pattern.behavioral.nullPattern.builder.RealCustomer;

/**
 * Created by krganeshrajhan on 11/12/16.
 */
public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
