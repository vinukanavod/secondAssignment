package package1;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        System.out.println("First student details -");
        student1.obtainDetails();
        System.out.println("Second student details -");
        student2.obtainDetails();
        System.out.println("Third student details -");
        student3.obtainDetails();
        System.out.println("Forth student details -");
        student4.obtainDetails();
        System.out.println("Fifth student details -");
        student5.obtainDetails();

        System.out.println("The grade of student1 is :" + student1.calculateGrade(student1.mark));
        System.out.println("The grade of student2 is :" + student2.calculateGrade(student2.mark));
        System.out.println("The grade of student3 is :" + student3.calculateGrade(student3.mark));
        System.out.println("The grade of student4 is :" + student4.calculateGrade(student4.mark));
        System.out.println("The grade of student5 is :" + student5.calculateGrade(student5.mark));
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
        student5.displayDetails();

    }
}
