package com.Emplyee;

import java.util.ArrayList;
import java.util.List;

public class Employees {
 
        private int id;
        private String name;
        private String gender;
        private double salary;
        private String post;
        List<String>Project=new ArrayList<>();


    public Employees(int id, String name, String gender, double salary, String post, List<String> project) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.post = post;
        Project = project;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public List<String> getProject() {
        return Project;
    }

    public void setProject(List<String> project) {
        Project = project;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", post='" + post + '\'' +
                ", Project=" + Project +
                '}';
    }
}
