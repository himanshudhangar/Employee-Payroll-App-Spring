package com.bridgelabz.employeepayrollapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeePayrollData {

    private int employeeId;

    private String name;

    private long salary;

    public EmployeePayrollData(){

    }

    public EmployeePayrollData(int employeeId,String name, long salary){
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
    }
}
