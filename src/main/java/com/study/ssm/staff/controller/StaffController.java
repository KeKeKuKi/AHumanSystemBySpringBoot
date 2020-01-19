package com.study.ssm.staff.controller;

import com.study.ssm.Util.Page;
import com.study.ssm.staff.domain.Department;
import com.study.ssm.staff.domain.Job;
import com.study.ssm.staff.domain.JobStaffDepartmentExtend;
import com.study.ssm.staff.domain.Staff;
import com.study.ssm.staff.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    StaffService staffService;
    @RequestMapping("/all")
    public String allStaff(HttpServletRequest request){
        try {
            String pageNumber = request.getParameter("page");
            int courentPage = Integer.parseInt(pageNumber);
            Page jobStaffsPage = staffService.getAllJobStaffByPage();
            request.setAttribute("staffList",jobStaffsPage.getPage(courentPage));
            request.setAttribute("pageBuffer",jobStaffsPage.getPageBuffer(courentPage));
        }catch (Exception e){
            int courentPage = 1;
            Page jobStaffsPage = staffService.getAllJobStaffByPage();
            request.setAttribute("staffList",jobStaffsPage.getPage(courentPage));
            request.setAttribute("pageBuffer",jobStaffsPage.getPageBuffer(courentPage));
            return "list1";
        }
        return "list1";
    }



    @RequestMapping("/jsstaff")
    public String jsStaff(HttpServletRequest request){
        try {
            String pageNumber = request.getParameter("page");
            int courentPage = Integer.parseInt(pageNumber);
            Page page = staffService.getjsStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
        }catch (Exception e){
            int courentPage = 1;
            Page page = staffService.getjsStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
            return "technology";
        }
        return "technology";
    }

    @RequestMapping("/backstaff")
    public String BackStaff(HttpServletRequest request){
        try {
            String pageNumber = request.getParameter("page");
            int courentPage = Integer.parseInt(pageNumber);
            Page page = staffService.getHouduanStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
        }catch (Exception e){
            int courentPage = 1;
            Page page = staffService.getHouduanStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
            return "technology";
        }
        return "technology";
    }

    @RequestMapping("/serverstaff")
    public String ServerStaff(HttpServletRequest request){
        try {
            String pageNumber = request.getParameter("page");
            int courentPage = Integer.parseInt(pageNumber);
            Page page = staffService.getServerStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
        }catch (Exception e){
            int courentPage = 1;
            Page page = staffService.getServerStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
            return "technology";
        }
        return "technology";
    }

    @RequestMapping("/workshopstaff")
    public String WorkshopStaff(HttpServletRequest request){
        try {
            String pageNumber = request.getParameter("page");
            int courentPage = Integer.parseInt(pageNumber);
            Page page = staffService.getCarRoomStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
        }catch (Exception e){
            int courentPage = 1;
            Page page = staffService.getCarRoomStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
            return "workshopstaff";
        }
        return "workshopstaff";
    }


    @RequestMapping("/salestaff")
    public String SaleStaff(HttpServletRequest request){
        try {
            String pageNumber = request.getParameter("page");
            int courentPage = Integer.parseInt(pageNumber);
            Page page = staffService.getsellStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
        }catch (Exception e){
            int courentPage = 1;
            Page page = staffService.getsellStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
            return "salestaff";
        }
        return "salestaff";
    }

    @RequestMapping("/findAStaffById")
    public String FindAStaffById(HttpServletRequest request){
        int id = 0;
        try {
            String pageNumber = request.getParameter("page");
            int courentPage = Integer.parseInt(pageNumber);
            id = Integer.parseInt(request.getParameter("id"));
            Page page = staffService.getAStaffByPage(id);
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
        }catch (Exception e){
            e.printStackTrace();
            int courentPage = 1;
            Page page = staffService.getAStaffByPage(id);
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
            return "find";
        }
        return "find";
    }

    @RequestMapping("/findAStaffByLike")
    public String FindAStaffByLike(HttpServletRequest request){
        try {
            String pageNumber = request.getParameter("page");
            String word = request.getParameter("word");
            int courentPage = Integer.parseInt(pageNumber);
            Page page = staffService.getAStaffByLike(word);
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
        }catch (Exception e){
            e.printStackTrace();
            return "find";
        }
        return "find";
    }


    @RequestMapping("/businessstaff")
    public String BusinessStaff(HttpServletRequest request){
        try {
            String pageNumber = request.getParameter("page");
            int courentPage = Integer.parseInt(pageNumber);
            Page page = staffService.getYeWuStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
        }catch (Exception e){
            int courentPage = 1;
            Page page = staffService.getYeWuStaffByPage();
            request.setAttribute("staffList",page.getPage(courentPage));
            request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
            return "salestaff";
        }
        return "salestaff";
    }


    @RequestMapping("/deletetaff")
    public void DeleteStaff(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            String idstr = request.getParameter("id");
            if(staffService.deleteStaffById(Integer.parseInt(idstr))){
                response.getWriter().print("true");
            }else response.getWriter().print("false");
        }catch (Exception e){
            response.getWriter().print("false");
            e.printStackTrace();
        }

    }

    @RequestMapping("/findAStaff")
    public void FindAStaff(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            String idstr = request.getParameter("id");
            JobStaffDepartmentExtend staff = staffService.getAStaffByStaffid(Integer.parseInt(idstr));

            response.getWriter().print(staff.toString());
        }catch (Exception e){
            response.getWriter().print("false");
            e.printStackTrace();
        }

    }



    @RequestMapping("/updateStaff")
    public void UpdateStaff(HttpServletResponse response,JobStaffDepartmentExtend staff) throws IOException {
        System.out.println(staff.toString());
        if(staffService.updateStaff(staff)>0){
            response.getWriter().print("true");
        }else response.getWriter().print("false");
    }

    @RequestMapping("/console")
    public String Console(HttpServletRequest request){
        List<Job> jobs= staffService.getAllJob();
        List<Department> departments = staffService.getAllDepartment();
        request.setAttribute("jobs",jobs);
        request.setAttribute("departments",departments);
        return "console";
    }

    @RequestMapping("/find")
    public String Find(HttpServletRequest request){
        String pageNumber = request.getParameter("page");
        int courentPage = Integer.parseInt(pageNumber);
        Page page = staffService.getAllStaffByPage();
        request.setAttribute("staffList",page.getPage(courentPage));
        request.setAttribute("pageBuffer",page.getPageBuffer(courentPage));
        return "find";
    }

    @RequestMapping("/addstaff")
    public String addStaff(HttpServletRequest request,Staff staff){
        int n=staffService.addStaff(staff);
        if (n>0){
            request.setAttribute("mes","添加成功！");
        }else request.setAttribute("mes","添加失败！");
        List<Job> jobs= staffService.getAllJob();
        List<Department> departments = staffService.getAllDepartment();
        request.setAttribute("jobs",jobs);
        request.setAttribute("departments",departments);
        return "console";
    }

    @RequestMapping("/addJob")
    public void addJob(HttpServletResponse response,Job job) throws IOException {
        int n1=staffService.addJob(job);
        if (n1>0){
            response.getWriter().print("true");
        }else response.getWriter().print("false");

    }





}
