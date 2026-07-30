package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "kss_student_scholarship")
public class Scholarship implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "org_name", nullable = false, length = 150)
    private String orgName;

    @Column(name = "emp_no", nullable = false, length = 50)
    private String empNo;

    @Column(name = "emp_name", nullable = false, length = 150)
    private String empName;

    @Column(name = "designation", length = 100)
    private String designation;

    @Column(name = "children_name", nullable = false, length = 150)
    private String childrenName;

    @Column(name = "dob")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    @Column(name = "gender")
    private String gender;

    @Column(name = "relationship", length = 50)
    private String relationship;

    @Column(name = "child_order")
    private String childOrder;

    @Column(name = "spouse_working_smiore")
    private String spouseWorkingSMIORE;

    @Column(name = "spouse_working_group_companies")
    private String spouseWorkingGroupCompanies;

    @Column(name = "college_name", length = 200)
    private String collegeName;

    @Column(name = "course", length = 150)
    private String course;

    @Column(name = "present_year", length = 50)
    private String presentYear;

    @Column(name = "previous_ay_percentage", precision = 5, scale = 2)
    private BigDecimal previousAyPercentage;

    @Column(name = "fee_amount_current_ay", precision = 12, scale = 2)
    private BigDecimal feeAmountCurrentAy;

    @Column(name = "employee_name_passbook", length = 150)
    private String employeeNamePassbook;

    @Column(name = "bank_account_no", length = 50)
    private String bankAccountNo;

    @Column(name = "ifsc_code", length = 20)
    private String ifscCode;

    @Column(name = "bank_name", length = 100)
    private String bankName;

    @Column(name = "branch_name", length = 100)
    private String branchName;

    @Lob
    @Column(name = "previous_ay_marks_card")
    private byte[] previousAyMarksCard;

    @Lob
    @Column(name = "kss_application")
    private byte[] kssApplication;

    @Lob
    @Column(name = "fee_structure")
    private byte[] feeStructure;

    @Lob
    @Column(name = "fee_receipts")
    private byte[] feeReceipts;

    @Lob
    @Column(name = "parent_aadhar_copy")
    private byte[] parentAadharCopy;

    @Lob
    @Column(name = "student_aadhar_copy")
    private byte[] studentAadharCopy;

    @Lob
    @Column(name = "bank_passbook_first_page")
    private byte[] bankPassbookFirstPage;

    public Scholarship() {}

    // --- Getters and Setters ---
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) { this.orgName = orgName; }

    public String getEmpNo() { return empNo; }
    public void setEmpNo(String empNo) { this.empNo = empNo; }

    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String getChildrenName() { return childrenName; }
    public void setChildrenName(String childrenName) { this.childrenName = childrenName; }

    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getRelationship() { return relationship; }
    public void setRelationship(String relationship) { this.relationship = relationship; }

    public String getChildOrder() { return childOrder; }
    public void setChildOrder(String childOrder) { this.childOrder = childOrder; }

    public String getSpouseWorkingSMIORE() { return spouseWorkingSMIORE; }
    public void setSpouseWorkingSMIORE(String spouseWorkingSMIORE) { this.spouseWorkingSMIORE = spouseWorkingSMIORE; }

    public String getSpouseWorkingGroupCompanies() { return spouseWorkingGroupCompanies; }
    public void setSpouseWorkingGroupCompanies(String spouseWorkingGroupCompanies) { this.spouseWorkingGroupCompanies = spouseWorkingGroupCompanies; }

    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getPresentYear() { return presentYear; }
    public void setPresentYear(String presentYear) { this.presentYear = presentYear; }

    public BigDecimal getPreviousAyPercentage() { return previousAyPercentage; }
    public void setPreviousAyPercentage(BigDecimal previousAyPercentage) { this.previousAyPercentage = previousAyPercentage; }

    public BigDecimal getFeeAmountCurrentAy() { return feeAmountCurrentAy; }
    public void setFeeAmountCurrentAy(BigDecimal feeAmountCurrentAy) { this.feeAmountCurrentAy = feeAmountCurrentAy; }

    public String getEmployeeNamePassbook() { return employeeNamePassbook; }
    public void setEmployeeNamePassbook(String employeeNamePassbook) { this.employeeNamePassbook = employeeNamePassbook; }

    public String getBankAccountNo() { return bankAccountNo; }
    public void setBankAccountNo(String bankAccountNo) { this.bankAccountNo = bankAccountNo; }

    public String getIfscCode() { return ifscCode; }
    public void setIfscCode(String ifscCode) { this.ifscCode = ifscCode; }

    public String getBankName() { return bankName; }
    public void setBankName(String bankName) { this.bankName = bankName; }

    public String getBranchName() { return branchName; }
    public void setBranchName(String branchName) { this.branchName = branchName; }

    public byte[] getPreviousAyMarksCard() { return previousAyMarksCard; }
    public void setPreviousAyMarksCard(byte[] previousAyMarksCard) { this.previousAyMarksCard = previousAyMarksCard; }

    public byte[] getKssApplication() { return kssApplication; }
    public void setKssApplication(byte[] kssApplication) { this.kssApplication = kssApplication; }

    public byte[] getFeeStructure() { return feeStructure; }
    public void setFeeStructure(byte[] feeStructure) { this.feeStructure = feeStructure; }

    public byte[] getFeeReceipts() { return feeReceipts; }
    public void setFeeReceipts(byte[] feeReceipts) { this.feeReceipts = feeReceipts; }

    public byte[] getParentAadharCopy() { return parentAadharCopy; }
    public void setParentAadharCopy(byte[] parentAadharCopy) { this.parentAadharCopy = parentAadharCopy; }

    public byte[] getStudentAadharCopy() { return studentAadharCopy; }
    public void setStudentAadharCopy(byte[] studentAadharCopy) { this.studentAadharCopy = studentAadharCopy; }

    public byte[] getBankPassbookFirstPage() { return bankPassbookFirstPage; }
    public void setBankPassbookFirstPage(byte[] bankPassbookFirstPage) { this.bankPassbookFirstPage = bankPassbookFirstPage; }
}