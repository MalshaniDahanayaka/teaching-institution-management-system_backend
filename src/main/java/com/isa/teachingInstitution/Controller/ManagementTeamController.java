package com.isa.teachingInstitution.Controller;

import com.isa.teachingInstitution.Model.Course;
import com.isa.teachingInstitution.Repository.CourseRepository;
import com.isa.teachingInstitution.Repository.ManagementTeamRepository;
import com.isa.teachingInstitution.Service.ManagementTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/managementTeam")
public class ManagementTeamController {
    @Autowired
    private ManagementTeamService managementTeamService;
    @GetMapping("/allCourses")
    public List<Course> getAllCourses(){
        return managementTeamService.getAllCourses();
    }
}
