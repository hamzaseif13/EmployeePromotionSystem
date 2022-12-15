package com.example.employeepromotionsystem.models;

import java.util.Date;

public class Transfer {
    private int id;
    private Date createDate;
    private int currentRank;
    private String description;
    private boolean managerApprove;
    private boolean directorApprove;
    private boolean vpApprove;
    private boolean presidentApprove;
    private State state;
    private Employee employee;
}
