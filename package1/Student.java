package package1;

import java.util.Scanner;

public class Student {
    //
    String name;
    String email;
    int age;
    String address;
    int mark;


    public Student(String name, String email, int age, String address, int mark) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.mark = mark;
    }

    public Student() {

    }

    public void obtainDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        this.name = sc.nextLine();
        System.out.print("email : ");
        this.email = sc.nextLine();
        System.out.print("Age : ");
        this.age = sc.nextInt();
        System.out.print("Marks : ");
        this.mark = sc.nextInt();
        sc.nextLine();
        System.out.print("Address : ");
        this.address = sc.nextLine();

    }

    public String calculateGrade(int mark) {
        if (mark >= 90) {
            return "A";
        } else if (mark >= 80) {
            return "B";
        } else if (mark >= 70) {
            return "C";
        } else if (mark >= 60) {
            return "D";
        } else  {
            return "F";
        }
    }

    public void  displayDetails (){
        System.out.println("Students Name :  " + name);
        System.out.println("Students age : " +age );
        System.out.println("Students email : "+email);
        System.out.println("Students address : "+address);
        System.out.println("Students mark : "+mark);
        System.out.println("Students grade is : "+calculateGrade(mark));
    }

}
