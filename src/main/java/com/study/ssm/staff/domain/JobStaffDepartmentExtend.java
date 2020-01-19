package com.study.ssm.staff.domain;

import java.util.Date;

public class JobStaffDepartmentExtend extends JobStaffExtend{
    Integer departmentId;
    String departmentName;
    String departmentFunction;
    String departmentAdress;

    public JobStaffDepartmentExtend(Integer staffId, String staffName, String staffAge, String staffSex
            , String staffEntrytime, String staffPhonenumber, Integer staffJob, String staffEmail
            , int staffSalary, Integer jobId, String jobName, Integer jobMaxSalary, Integer jobMinSalary
            , Integer jobDepartment, Integer departmentId, String departmentName, String departmentFunction
            , String departmentAdress) {
        super(staffId, staffName, staffAge, staffSex, staffEntrytime, staffPhonenumber, staffJob
                , staffEmail, staffSalary, jobId, jobName, jobMaxSalary, jobMinSalary, jobDepartment);
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentFunction = departmentFunction;
        this.departmentAdress = departmentAdress;
    }


    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentFunction() {
        return departmentFunction;
    }

    public void setDepartmentFunction(String departmentFunction) {
        this.departmentFunction = departmentFunction;
    }

    public String getDepartmentAdress() {
        return departmentAdress;
    }

    public void setDepartmentAdress(String departmentAdress) {
        this.departmentAdress = departmentAdress;
    }

    @Override
    public String toString() {
        return this.staffName+","+this.staffAge+","+this.jobName+","+this.staffEntrytime+","+this.staffEmail+","+this.staffSalary+","+this.staffPhonenumber+","+this.staffId;
    }

}
