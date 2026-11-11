package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private boolean punchedIn;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.startTime = 0;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    public void punchIn(int time){
        startTime = time;
        punchedIn = true;
    }


    public double getRegularHours(){
       if(this.hoursWorked <= 40){
           return this.hoursWorked;
       }
       else{
           return 40;
       }
    }

    public double getOvertimeHours(){
        if (this.hoursWorked <= 40){
            return 0;
        }
        else {
            return this.hoursWorked - 40;
        }
    }
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        startTime = now.getHour() + now.getMinute() / 60.0;
        punchedIn = true;
    }
    public void punchOut(int time) {
        addShift(time);
    }
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        addShift(now.getHour() + now.getMinute() / 60.0);
    }
    private void addShift(double endTime) {
        if (!punchedIn) {
            System.out.println(name + " is not punched in.");
            return;
        }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getTotalPay(){
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }



}


