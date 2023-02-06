package com.isa.teachingInstitution.Controller;

import com.isa.teachingInstitution.Model.Request.JwtRequest;
import com.isa.teachingInstitution.Model.Response.JwtResponse;
import com.isa.teachingInstitution.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private LoginService loginService;


    @PostMapping("/user")
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception{
        return loginService.createJwtToken(jwtRequest);
    }
}
