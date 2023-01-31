package com.isa.teachingInstitution.Model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name="student")
public class Student extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="student_id", nullable = false)
    private String studentID;

    @Column(name="department", nullable = false)
    private String department;

    @Column(name="address", nullable = false)
    private String address;


    public Student(String username, String email, String password, String firstName, String lastName,
                   String studentID, String department, String address) {

        super(username, email, password, firstName, lastName);
        this.studentID = studentID;
        this.department = department;
        this.address = address;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
