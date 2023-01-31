package com.isa.teachingInstitution.Controller;

import com.isa.teachingInstitution.Exceptions.SaveDataException;
import com.isa.teachingInstitution.Model.Request.StudentSignup;
import com.isa.teachingInstitution.Service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/signup")
public class SignupController {

    @GetMapping("/test")
    public String test() {
        return "Testing";
    }

    @Autowired
    private SignupService signupService;

    @PostMapping("/student")
    public ResponseEntity<String> getStudentSignup(@RequestBody StudentSignup studentSignup){
        try {

            return new ResponseEntity<>(signupService.saveStudentDetails(studentSignup), HttpStatus.CREATED);

        }catch (SaveDataException ex){

            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
