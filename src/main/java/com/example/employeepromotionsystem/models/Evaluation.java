package com.example.employeepromotionsystem.models;

import java.util.Date;
import java.util.List;


public class Evaluation {
    private int id;
    private Date startedAt;
    private String notes;
    private int percentage;
    private State state;
    private Employee manager;
    private Employee employee;
    private List<Goal> goals;
    private List<Achievement> achievement;

}
