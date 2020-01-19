package com.study.ssm.staff.domain;

import java.util.Date;

public class Staff {
    Integer staffId;
    String staffName;
    String staffAge;
    String staffSex;
    String staffEntrytime;
    String staffPhonenumber;
    Integer staffJob;
    String staffEmail;
    int staffSalary;

    public int getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(int staffSalary) {
        this.staffSalary = staffSalary;
    }
    public Staff(String staffName, String staffAge, String staffSex, String staffEntrytime, String staffPhonenumber, Integer staffJob, String staffEmail, int staffSalary) {
        this.staffName = staffName;
        this.staffAge = staffAge;
        this.staffSex = staffSex;
        this.staffEntrytime = staffEntrytime;
        this.staffPhonenumber = staffPhonenumber;
        this.staffJob = staffJob;
        this.staffEmail = staffEmail;
        this.staffSalary = staffSalary;
    }

    public Staff(Integer staffId, String staffName, String staffAge, String staffSex, String staffEntrytime, String staffPhonenumber, Integer staffJob, String staffEmail, int staffSalary) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffAge = staffAge;
        this.staffSex = staffSex;
        this.staffEntrytime = staffEntrytime;
        this.staffPhonenumber = staffPhonenumber;
        this.staffJob = staffJob;
        this.staffEmail = staffEmail;
        this.staffSalary = staffSalary;
    }

    public Staff() {
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(String staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex;
    }

    public String getStaffEntrytime() {
        return staffEntrytime;
    }

    public void setStaffEntrytime(String staffEntrytime) {
        this.staffEntrytime = staffEntrytime;
    }

    public String getStaffPhonenumber() {
        return staffPhonenumber;
    }

    public void setStaffPhonenumber(String staffPhonenumber) {
        this.staffPhonenumber = staffPhonenumber;
    }

    public Integer getStaffJob() {
        return staffJob;
    }

    public void setStaffJob(Integer staffJob) {
        this.staffJob = staffJob;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }


}
