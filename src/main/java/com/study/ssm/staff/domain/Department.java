package com.study.ssm.staff.domain;

public class Department {
    Integer departmentId;
    String departmentName;
    String departmentFunction;
    String departmentAdress;

    public Department() {
    }

    public Department(Integer departmentId, String departmentName, String departmentFunction, String departmentAdress) {
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
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentFunction='" + departmentFunction + '\'' +
                ", departmentAdress='" + departmentAdress + '\'' +
                '}';
    }
}
