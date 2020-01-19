package com.study.ssm.staff.service;


import com.study.ssm.Util.Page;
import com.study.ssm.staff.domain.*;

import java.util.LinkedList;
import java.util.List;

public interface StaffService {
    List<JobStaffDepartmentExtend> getAllStaff();
    Page getAllJobStaffByPage();
    Page getAStaffByPage(int id);
    Page getAllStaffByPage();
    Page getjsStaffByPage();
    Page getAStaffByLike(String word);
    Page getHouduanStaffByPage();
    Page getsellStaffByPage();
    Page getServerStaffByPage();
    Page getYeWuStaffByPage();
    Page getCarRoomStaffByPage();
    boolean deleteStaffById(int id);
    JobStaffDepartmentExtend getAStaffByStaffid(int id);
    int updateStaff(JobStaffDepartmentExtend stff);
    List<Job> getAllJob();
    List<Department> getAllDepartment();
    int addStaff(Staff staff);
    int addJob(Job job);


}
