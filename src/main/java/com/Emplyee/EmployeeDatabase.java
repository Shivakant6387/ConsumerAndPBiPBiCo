package com.Emplyee;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {
  public static List<Employees> getAllEmployee(){
      Employees employees1=new Employees(1,"Adam",3.5,"Software Testing", Arrays.asList("Chat App","TO DO List"));
      Employees employees2=new Employees(2,"Ankit",4.5,"Software Developer", Arrays.asList("Chat App","TO DO List"));
      Employees employees3=new Employees(3,"Jocson",3.5,"Front End Developer", Arrays.asList("Chat App","TO DO List"));
      Employees employees4=new Employees(4,"Jolly",3.5,"Back End Developer", Arrays.asList("Chat App","TO DO List"));
      Employees employees5=new Employees(5,"Shadam",3.5,"Mysql Testing", Arrays.asList("Chat App","TO DO List"));
      Employees employees6=new Employees(6,"Sakshi",3.5,"Sql Data Base Developer", Arrays.asList("Chat App","TO DO List"));
      Employees employees7=new Employees(7,"Rakesh",3.5,"Full Stack Developer", Arrays.asList("Chat App","TO DO List"));
      Employees employees8=new Employees(8,"Jocky",3.5,"Java Developer", Arrays.asList("Chat App","TO DO List"));
      Employees employees9=new Employees(9,"Amit",3.5,"PHP Developer", Arrays.asList("Chat App","TO DO List"));
      Employees employees10=new Employees(10,"Shivani",3.5,"Python Developer", Arrays.asList("Chat App","TO DO List"));
      Employees employees11=new Employees(11,"Lakshmi",3.5,"DevOps", Arrays.asList("Chat App","TO DO List"));
      Employees employees12=new Employees(12,"Shima",3.5,"mongodb Developer", Arrays.asList("Chat App","TO DO List"));
      List<Employees>employees=Arrays.asList(employees1,employees2,employees3,employees4,employees5,employees6,employees7,employees8,employees9,employees10,employees11,employees12);
      return employees;
  }
}
