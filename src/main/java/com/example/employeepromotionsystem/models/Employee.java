package com.example.employeepromotionsystem.models;

import java.util.Date;


public class Employee {
    private int id;
    private String firstName;
    private String secondName;
    private double salary;
    private String email;
    private int rank;
    private Date hireDate;
    private String jobTitle;
    private Role role;
    private Department department;
    private String password;

    public Employee(int id, String firstName, String secondName,
                    double salary, String email, int rank, Date hireDate,
                    String jobTitle, Role role, Department department, String password) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
        this.email = email;
        this.rank = rank;
        this.hireDate = hireDate;
        this.jobTitle = jobTitle;
        this.role = role;
        this.department = department;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
