package example.design.pattern.behavioral.mvc.builder;

/**
 * Created by krganeshrajhan on 23/12/16.
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
