package com.Database;
import java.util.function.BiConsumer;
public class StudentResult {
    public static void main(String[] args) {
        BiConsumer<Student,Integer>biConsumer=(student, integer) ->student.marks= student.marks;
        Student[]m={
                new Student("Vinay",90),
                new Student("Rahul",78),
                new Student("Vikram",95),
                new Student("Sakshi",98),
                new Student("Amrita",89)


        };
        for (Student s:m
             ) {
            biConsumer.accept(s,5);
        }
        for (Student s:m
             ) {
            System.out.println("Name:"+s.name+"\tMarks:"+s.marks);
        }
    }
}
