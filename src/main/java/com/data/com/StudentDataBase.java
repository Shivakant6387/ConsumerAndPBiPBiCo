package com.data.com;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDataBase {
    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<Student>getAllStudents(){
        /**
         * 2nd grade students
         */
        Student Student1=new Student("Adam",2,3.6,"male", Arrays.asList("swinging","basketball","volleyball"));
        Student Student2=new Student("Jenny",2,3.8,"female",Arrays.asList("Swimming","gymnastics","aerobics"));
        /**
         * 3rd grade students
         */
        Student Student3=new Student("Emily",3,4.0,"female",Arrays.asList("swimming","gymnastics","soccer"));
        Student Student4=new Student("Dave",3,3.9,"male",Arrays.asList("swimming","soccer","basketball"));
        /**
         * 4th grade students
         */
        Student Student5=new Student("Sophia",4,3.5,"female",Arrays.asList("swimming","football","baseball"));
        Student Student6=new Student("James",4,3.9,"male",Arrays.asList("swimming","basketball","football"));
        List<Student>Students=Arrays.asList(Student1,Student2,Student3,Student4,Student5,Student6);
        return Students;
    }
}
