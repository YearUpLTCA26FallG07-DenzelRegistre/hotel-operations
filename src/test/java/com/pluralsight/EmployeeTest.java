package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    @Test
    public void TestUnder40NoOvertime(){
        //arrange
        Employee e = new Employee(123, "John", "Tools", 10, 39);
        e.setHoursWorked(39);
        e.setPayRate(10);
        double regularHours = 39;
        double overtimeHours = 0;
        double pay = 390;
        //

        double actualRegularHours = e.getRegularHours();
        double actualOvertimeHours = e.getOvertimeHours();
        double actualPay = e.getTotalPay();

        //assert
        assertEquals(regularHours, actualRegularHours);
        assertEquals(overtimeHours, actualOvertimeHours);
        assertEquals(pay, actualPay);
    }

    @Test
    public void TestOver40WithOverTime(){
        //arrange
    Employee e = new Employee(192,"Willow", "Makeup", 10, 41);
        e.setHoursWorked(41);
        e.setPayRate(10);
        double regularHours = 40;
        double overtimeHours = 1;
        double pay = 415;

        //act
        double actualRegularHours = e.getRegularHours();
        double actualOvertimeHours = e.getOvertimeHours();
        double actualPay = e.getTotalPay();

        //assert
        assertEquals(regularHours, actualRegularHours);
        assertEquals(overtimeHours, actualOvertimeHours);
        assertEquals(pay, actualPay);

    }




}