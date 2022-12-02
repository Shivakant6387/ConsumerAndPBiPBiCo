package org.example;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class Student2 {

    // member variables
    String name;
    int marks;

    // public constructor
    public Student2(String name, int marks) {
        super();
        this.name = name;
        this.marks = marks;
    }
}
public class StudentResultCalculationAndPrinting {
    public static void main(String[] args) {

        // 1. lambda expression to check student scored more than 60 using Predicate FI
        Predicate<Student2> p = s -> s.marks >= 60;

        // 2. lambda expression to find grade of Student supplied
        Function<Student2, String> f = student -> {

            // alternatively, we can switch statement as well
            if(student.marks >= 90)
                return "Merit";
            else if(student.marks >= 75)
                return "Distinction";
            else if(student.marks >= 60)
                return "First class";
            else if(student.marks >= 50)
                return "Second class";
            else if(student.marks >= 35)
                return "Pass class";
            else
                return "Failed";
        };

        // 3. lambda expression to print Student Info to console using Consumer FI
        Consumer<Student2> c = s -> {
            System.out.print("Name : " + s.name + "\t");
            System.out.print("Marks : " + s.marks + "\t");

            // Step 3 - find grade using Function FI
            System.out.println("Grade : " + f.apply(s));
        };

        // create Student object for applying Function
        Student2[] sArray = {
                new Student2("Vijay", 97),
                new Student2("Ajith", 78),
                new Student2("Vikram", 66),
                new Student2("Surya", 54),
                new Student2("Karthi", 43),
                new Student2("Arya", 31)
        };

        // iterate through check and find Student grade using Function FI
        for(Student2 s : sArray) {

            // Step 1 : check student marks using Predicate FI
            if(p.test(s)) {

                // Step 2 : print to console using Consumer, after finding grade
                c.accept(s);
            }
        }
    }

}
