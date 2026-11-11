package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    public void TestUnder40NoOvertime(){
        //arrange
        Employee e = new Employee();
        e.setHoursWorked(39);
        e.setPayRate(10);
        double regularHours = 39;
        double overtimeHours = 0;
        double pay = 390;
        //

        double actualRegularHours = e.getRegularHours();
        double actualOvertimeHours = e.getOvertimeHours();
        double acturalPay = e.getTotalPay();

        //assert
        assertEquals(regularHours, actualRegularHours);
        assertEquals(overtimeHours, actualOvertimeHours);
        assertEquals(pay, acturalPay);
    }





}