package com.example.employeepromotionsystem.models;

import java.util.Date;

public class Promotion {
    //promote from rank 1 to rank 2
    private int id;
    private int currentRank;
    private String description;
    private boolean managerApprove;
    private boolean directorApprove;
    private boolean vpApprove;
    private boolean presidentApprove;
    private State state;
    private Employee employee;
    private Date createdAt;
}
