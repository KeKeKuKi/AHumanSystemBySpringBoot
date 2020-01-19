package com.study.ssm.staff.dao;


import com.study.ssm.staff.domain.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StaffDao {

    @Select("select * from staff left join jobs on staff.staffjob=" +
            "jobs.jobid left join department on jobs.jobdepartment=" +
            "department.departmentid")
    List<JobStaffDepartmentExtend> selectAllStaff();

    @Select("select * from staff left join jobs on staff.staffjob=" +
            "jobs.jobid left join department on jobs.jobdepartment=" +
            "department.departmentid where staffid = #{id}")
    List<JobStaffDepartmentExtend> selectAStaffById(int id);

    @Select("select * from staff left join jobs on staff.staffjob=" +
            "jobs.jobid left join department on jobs.jobdepartment=" +
            "department.departmentid where staffname like CONCAT('%',#{word},'%')")
    List<JobStaffDepartmentExtend> selectStaffByLike(String word);

    @Select("select * from staff left join jobs on staff.staffjob=" +
            "jobs.jobid left join department on jobs.jobdepartment=" +
            "department.departmentid")
    List<JobStaffDepartmentExtend> selectAllJobStaff();

    @Select("select * from staff left join jobs on staff.staffjob" +
            "=jobs.jobid left join department on jobs.jobdepartment" +
            "=department.departmentid where departmentid = #{jobId}")
    List<JobStaffDepartmentExtend> selectStaffByJobid(int jobId);

    @Delete("delete from staff where staffid = #{id}")
    int deletStaffById(int id);


    @Update("UPDATE staff SET staffname=#{staffName} ,staffage=#{staffAge},staffphonenumber=#{staffPhonenumber} ,staffentrytime=#{staffEntrytime} ," +
            "staffemail=#{staffEmail} ,staffsalary=#{staffSalary} WHERE staffid=#{staffId}")
    int updateStff(JobStaffDepartmentExtend stff);


    @Select("select * from jobs")
    List<Job> selectJobs();

    @Select("select * from department")
    List<Department> selectDepartments();

    @Select("select * from jobs where jobid = #{id}")
    List<Job> selectJobById(int id);

    @Update("insert into staff(staffname,staffage,staffsex,staffentrytime,staffphonenumber,staffjob,staffemail,staffsalary) " +
            "values(#{staffName},#{staffAge},#{staffSex},#{staffEntrytime},#{staffPhonenumber},#{staffJob},#{staffEmail},#{staffSalary})")
    int addStaff(Staff staff);

    @Update("insert into jobs(jobid,jobname,jobmaxsalary,jobminsalary,jobdepartment) " +
            "values(#{jobId},#{jobName},#{jobMaxSalary},#{jobMinSalary},#{jobDepartment})")
    int addJob(Job job);
}
