package example.java.oops.encapsulation;

import example.java.oops.encapsulation.model.Employee;

/**
 * Created by krganeshrajhan on 18/3/17.
 */
public class EncapsulationDemo {

    public static void main(String [] args) {
        Employee employee = new Employee();
        employee.setName("James");
        employee.setAge(20);
        employee.setIdNum("12343ms");

        System.out.print("Name : " + employee.getName() + " Age : " + employee.getAge());
    }
}
