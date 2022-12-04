package com.Emplyee;

import java.util.List;
import java.util.function.Function;
import java.util.function.Consumer;
public class PrintEmployeeInfoUsingConsumerFI {
    public static void main(String[] args) {
        List<Employees> allEmployee = EmployeeDatabase.getAllEmployee();
        Consumer<Employees>consumer=employees -> {
            System.out.print("Id"+employees.getId()+"\t");
            System.out.print("Name"+employees.getName()+"\t");
            System.out.print("Salary"+employees.getSalary()+"\t");
            System.out.print("Post"+employees.getPost()+"\t");
            System.out.println("Project"+employees.getProject());
        };
              consumer.accept(allEmployee.get(0));

                allEmployee.forEach(consumer);
    }
}
