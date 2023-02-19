package com.isa.teachingInstitution.Controller;

import com.isa.teachingInstitution.Service.LoginService;
import com.isa.teachingInstitution.Service.LogoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logout")
public class LogoutController {
    @Autowired
    private LogoutService logoutService;
    @PostMapping("/user")
    public ResponseEntity<?> logout(@RequestHeader(value = "Authorization") String token) {
        logoutService.invalidateToken(token);
        return ResponseEntity.noContent().build();
    }


}
