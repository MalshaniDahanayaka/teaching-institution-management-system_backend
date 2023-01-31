package com.isa.teachingInstitution.Service;

import com.isa.teachingInstitution.Exceptions.SaveDataException;
import com.isa.teachingInstitution.Model.Request.StudentSignup;
import com.isa.teachingInstitution.Model.Student;
import com.isa.teachingInstitution.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {
    @Autowired
    private StudentRepository studentRepository;
    public String saveStudentDetails(StudentSignup studentSignup) throws SaveDataException {

        try {

            Student student = new Student(studentSignup.getUsername(), studentSignup.getEmail(), studentSignup.getPassword(),
                    studentSignup.getFirstName(), studentSignup.getLastName(), studentSignup.getStudentID(),
                    studentSignup.getDepartment(), studentSignup.getAddress());

            studentRepository.save(student);

        }catch(Exception error){

            throw new SaveDataException("Error saving data" + studentSignup.getUsername(), error);
        }

        return "success";
    }
}
