package com.nestdigital.xyzbackendnew.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="students")
public class StudentModel {
@Id
@GeneratedValue
    private int id;
    private String name;
    private int rollno;
    private int admissionno;
    private String college;
    private String department;
    private String bloodgroup;
    private String dob;
    private String parentname;
    private String parentemailid;
    private String guardianname;
    private String guardianaddress;

    public StudentModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAdmissionno() {
        return admissionno;
    }

    public void setAdmissionno(int admissionno) {
        this.admissionno = admissionno;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getParentemailid() {
        return parentemailid;
    }

    public void setParentemailid(String parentemailid) {
        this.parentemailid = parentemailid;
    }

    public String getGuardianname() {
        return guardianname;
    }

    public void setGuardianname(String guardianname) {
        this.guardianname = guardianname;
    }

    public String getGuardianaddress() {
        return guardianaddress;
    }

    public void setGuardianaddress(String guardianaddress) {
        this.guardianaddress = guardianaddress;
    }

    public StudentModel(int id, String name, int rollno, int admissionno, String college, String department, String bloodgroup, String dob, String parentname, String parentemailid, String guardianname, String guardianaddress) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.admissionno = admissionno;
        this.college = college;
        this.department = department;
        this.bloodgroup = bloodgroup;
        this.dob = dob;
        this.parentname = parentname;
        this.parentemailid = parentemailid;
        this.guardianname = guardianname;
        this.guardianaddress = guardianaddress;
    }
}

