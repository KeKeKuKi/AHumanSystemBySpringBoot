package com.study.ssm.staff.domain;

import java.util.Date;

public class JobStaffExtend extends Staff{
    Integer jobId;
    String jobName;
    Integer jobMaxSalary;
    Integer jobMinSalary;
    Integer jobDepartment;

    public JobStaffExtend(Integer staffId, String staffName, String staffAge, String staffSex, String staffEntrytime, String staffPhonenumber, Integer staffJob, String staffEmail, int staffSalary, Integer jobId, String jobName, Integer jobMaxSalary, Integer jobMinSalary, Integer jobDepartment) {
        super(staffId, staffName, staffAge, staffSex, staffEntrytime, staffPhonenumber, staffJob, staffEmail, staffSalary);
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobMaxSalary = jobMaxSalary;
        this.jobMinSalary = jobMinSalary;
        this.jobDepartment = jobDepartment;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Integer getJobMaxSalary() {
        return jobMaxSalary;
    }

    public void setJobMaxSalary(Integer jobMaxSalary) {
        this.jobMaxSalary = jobMaxSalary;
    }

    public Integer getJobMinSalary() {
        return jobMinSalary;
    }

    public void setJobMinSalary(Integer jobMinSalary) {
        this.jobMinSalary = jobMinSalary;
    }

    public Integer getJobDepartment() {
        return jobDepartment;
    }

    public void setJobDepartment(Integer jobDepartment) {
        this.jobDepartment = jobDepartment;
    }


}
