package com.isa.teachingInstitution.Model.Request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentSignup {

    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String studentID;
    private String department;
    private String address;

}
