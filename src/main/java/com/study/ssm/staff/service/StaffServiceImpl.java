package com.study.ssm.staff.service;

import com.study.ssm.Util.Page;
import com.study.ssm.staff.dao.StaffDao;
import com.study.ssm.staff.domain.Department;
import com.study.ssm.staff.domain.Job;
import com.study.ssm.staff.domain.JobStaffDepartmentExtend;
import com.study.ssm.staff.domain.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("staffService")
public class StaffServiceImpl implements StaffService{
    @Autowired
    StaffDao staffDao;

    @Override
    public List<JobStaffDepartmentExtend> getAllStaff() {
        return staffDao.selectAllStaff();
    }

    @Override
    public Page getAStaffByLike(String word) {
        Page <JobStaffDepartmentExtend> page = new Page(1,8,staffDao.selectStaffByLike(word),"/staff/findAStaffByLike?word="+word+"&page=");
        return page;
    }
    @Override
    public Page getjsStaffByPage() {
        Page <JobStaffDepartmentExtend> page = new Page(1,10,staffDao.selectStaffByJobid(1),"/staff/jsstaff?page=");
        return page;
    }

    @Override
    public Page getHouduanStaffByPage() {
        Page <JobStaffDepartmentExtend> page = new Page(1,10,staffDao.selectStaffByJobid(2),"/staff/jsstaff?page=");
        return page;
    }

    @Override
    public Page getsellStaffByPage() {
        Page <JobStaffDepartmentExtend> page = new Page(1,10,staffDao.selectStaffByJobid(3),"/staff/jsstaff?page=");
        return page;
    }

    @Override
    public Page getServerStaffByPage() {
        Page <JobStaffDepartmentExtend> page = new Page(1,10,staffDao.selectStaffByJobid(4),"/staff/jsstaff?page=");
        return page;
    }

    @Override
    public Page getYeWuStaffByPage() {
        Page <JobStaffDepartmentExtend> page = new Page(1,10,staffDao.selectStaffByJobid(5),"/staff/jsstaff?page=");
        return page;
    }

    @Override
    public Page getCarRoomStaffByPage() {
        Page <JobStaffDepartmentExtend> page = new Page(1,10,staffDao.selectStaffByJobid(6),"/staff/jsstaff?page=");
        return page;
    }


    @Override
    public Page getAllJobStaffByPage() {
        Page <JobStaffDepartmentExtend> page = new Page(1,10,staffDao.selectAllJobStaff(),"/staff/all?page=");
        return page;
    }

    @Override
    public Page getAStaffByPage(int id) {
        staffDao.selectAStaffById(id).toString();
        Page <JobStaffDepartmentExtend> page = new Page(1,8,staffDao.selectAStaffById(id),"/staff/findAStaffById?id = "+id+"&page=");
        return page;
    }

    @Override
    public Page getAllStaffByPage() {
        Page <JobStaffDepartmentExtend> page = new Page(1,8,staffDao.selectAllStaff(),"/staff/find?page=");
        return page;
    }

    @Override
    public boolean deleteStaffById(int id) {
        if(staffDao.deletStaffById(id)>0) return true;
        else return false;
    }

    @Override
    public JobStaffDepartmentExtend getAStaffByStaffid(int id) {
        List<JobStaffDepartmentExtend> stff  = staffDao.selectAStaffById(id);
        if(stff.size()>0){
            return stff.get(0);
        }else return null;
    }

    @Override
    public int updateStaff(JobStaffDepartmentExtend stff) {
        try{
            return staffDao.updateStff(stff);
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }


    }

    @Override
    public List<Job> getAllJob() {
        return staffDao.selectJobs();
    }

    @Override
    public List<Department> getAllDepartment() {
        return staffDao.selectDepartments();
    }

    @Override
    public int addStaff(Staff staff) {
        try{
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
            String datastr = dateFormat.format( now );
            staff.setStaffEntrytime(datastr);
            return staffDao.addStaff(staff);
        }catch (Exception e){
            return 0;
        }

    }

    @Override
    public int addJob(Job job) {
        int id = 1;
        while(staffDao.selectJobById(id).size()>=1){
            id = (int)((Math.random()*9+1)*1000);
        }
        job.setJobId(id);
        return staffDao.addJob(job);
    }

}
