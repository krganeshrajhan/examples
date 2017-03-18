package example.java.oops.abstraction;

import example.java.oops.abstraction.model.Employee;
import example.java.oops.abstraction.model.Salary;

/**
 * Created by krganeshrajhan on 18/3/17.
 */
public class AbstractionDemo {

    public static void main(String [] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();

    }
}
