package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "kss_student_scholarship")
public class Scholarship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Employee Details
    @Column(name = "org_name")
    private String orgName;

    @Column(name = "emp_no")
    private String empNo;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "designation")
    private String designation;

    @Column(name = "spouse_working_smiore")
    private String spouseWorkingSMIORE;

    @Column(name = "spouse_working_group_companies")
    private String spouseWorkingGroupCompanies;

    // Student Details
    @Column(name = "children_name")
    private String childrenName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dob")
    private LocalDate dob;

    @Transient
    private String age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "relationship")
    private String relationship;

    @Column(name = "child_order")
    private String childOrder;

    // Academic Details
    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "course")
    private String course;

    @Column(name = "present_year")
    private String presentYear;

    @Column(name = "previous_ay_percentage")
    private Double previousAyPercentage;

    @Column(name = "fee_amount_current_ay")
    private Double feeAmountCurrentAy;

    // Bank Details
    @Column(name = "employee_name_passbook")
    private String employeeNamePassbook;

    @Column(name = "bank_account_no")
    private String bankAccountNo;

    @Column(name = "ifsc_code")
    private String ifscCode;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "branch_name")
    private String branchName;

    // File Uploads
    @Lob
    @Column(name = "previous_ay_marks_card")
    private byte[] previousAyMarksCard;

    @Lob
    @Column(name = "bank_passbook_first_page")
    private byte[] bankPassbookFirstPage;

    public Scholarship() {
    }

    //================ ID =================

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //================ Employee =================

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSpouseWorkingSMIORE() {
        return spouseWorkingSMIORE;
    }

    public void setSpouseWorkingSMIORE(String spouseWorkingSMIORE) {
        this.spouseWorkingSMIORE = spouseWorkingSMIORE;
    }

    public String getSpouseWorkingGroupCompanies() {
        return spouseWorkingGroupCompanies;
    }

    public void setSpouseWorkingGroupCompanies(String spouseWorkingGroupCompanies) {
        this.spouseWorkingGroupCompanies = spouseWorkingGroupCompanies;
    }

    //================ Student =================

    public String getChildrenName() {
        return childrenName;
    }

    public void setChildrenName(String childrenName) {
        this.childrenName = childrenName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getChildOrder() {
        return childOrder;
    }

    public void setChildOrder(String childOrder) {
        this.childOrder = childOrder;
    }

    //================ Academic =================

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPresentYear() {
        return presentYear;
    }

    public void setPresentYear(String presentYear) {
        this.presentYear = presentYear;
    }

    public Double getPreviousAyPercentage() {
        return previousAyPercentage;
    }

    public void setPreviousAyPercentage(Double previousAyPercentage) {
        this.previousAyPercentage = previousAyPercentage;
    }

    public Double getFeeAmountCurrentAy() {
        return feeAmountCurrentAy;
    }

    public void setFeeAmountCurrentAy(Double feeAmountCurrentAy) {
        this.feeAmountCurrentAy = feeAmountCurrentAy;
    }

    //================ Bank =================

    public String getEmployeeNamePassbook() {
        return employeeNamePassbook;
    }

    public void setEmployeeNamePassbook(String employeeNamePassbook) {
        this.employeeNamePassbook = employeeNamePassbook;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    //================ Files =================

    public byte[] getPreviousAyMarksCard() {
        return previousAyMarksCard;
    }

    public void setPreviousAyMarksCard(byte[] previousAyMarksCard) {
        this.previousAyMarksCard = previousAyMarksCard;
    }

    public byte[] getBankPassbookFirstPage() {
        return bankPassbookFirstPage;
    }

    public void setBankPassbookFirstPage(byte[] bankPassbookFirstPage) {
        this.bankPassbookFirstPage = bankPassbookFirstPage;
    }
}