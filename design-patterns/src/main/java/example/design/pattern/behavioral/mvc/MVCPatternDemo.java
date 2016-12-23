package example.design.pattern.behavioral.mvc;

import example.design.pattern.behavioral.mvc.builder.Student;
import example.design.pattern.behavioral.mvc.builder.StudentController;
import example.design.pattern.behavioral.mvc.builder.StudentView;

/**
 * Created by krganeshrajhan on 23/12/16.
 */
public class MVCPatternDemo {
    public static void main(String[] args) {
        //fetch student record based on his roll no from the database
        Student model  = retriveStudentFromDatabase();

        //Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
