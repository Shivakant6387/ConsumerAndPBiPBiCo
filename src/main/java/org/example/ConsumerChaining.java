package org.example;
import java.util.function.Consumer;
class Student1 {

    // member variables
    String name;
    int marks;

    // public constructor
    public Student1(String name, int marks) {
        super();
        this.name = name;
        this.marks = marks;
    }
}
public class ConsumerChaining {
    public static void main(String[] args) {

        // 1. lambda expression using Consumer FI to print console
        Consumer<Student1> c1 = s -> System.out.println(s.name
                + " enrolled for Java 8 course");

        // 2. lambda expression using Consumer FI to print console
        Consumer<Student1> c2 = s -> System.out.println(s.name
                + " completed course with " + s.marks + " marks.");

        // 3. lambda expression using Consumer FI to print console
        Consumer<Student1> c3 = s -> System.out.println(s.name
                + " successfully onboarded into live Java 8 project");

        // 4. lambda expression using Consumer FI to print console
        Consumer<Student1> c4 = s -> System.out.println(s.name
                + " got good appraisal and moved into new tech role");

        // final lambda expression combining above 4 Consumer lambda exp
        Consumer<Student1> c = c1.andThen(c2).andThen(c3).andThen(c4);

        // create Student object
        Student1 student = new Student1("Sharukh", 97);

        // invoking combined lambda expression for Consumer chaining
        c.accept(student);
    }
}



