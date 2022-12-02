package com.data.com;
import java.util.List;
import java.util.function.Consumer;
public class PrintStudentInfoUsingConsumerFI
{
    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();


        Consumer<Student>consumer= students -> {
            System.out.print("Name"+students.getName()+"\t");
            System.out.print("gradeLevel"+students.getGradeLevel()+"\t");
            System.out.print("Gpa"+students.getGpa()+"\t");
            System.out.print("Gender"+students.getGender()+"\t");
            System.out.println("Activities"+students.activities);
        };

        consumer.accept(allStudents.get(0));

       allStudents.forEach(consumer);

//        for (Student s :allStudents)
//            System.out.println(s);
        }

  }

