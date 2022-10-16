/**
 * EmployeePayrollData.java
 */
package com.bridgelabz.employeepayrollapp.model;


import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;
/***********************************************************************************************************************
 * Class :- Employee Payroll Data.
 * @author Himanshu
 **********************************************************************************************************************/

import javax.persistence.Entity;
import javax.persistence.Id;



@Data
@Entity
public class EmployeePayrollData {
    @Id
    private int employeeId;
    private String name;
    private long salary;

    public EmployeePayrollData(){}

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO){
        this.employeeId=empId;
        this.name=employeePayrollDTO.name;
        this.salary=employeePayrollDTO.salary;
    }
}