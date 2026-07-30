package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="organization_master")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="org_id")
    private Integer orgId;

    @Column(name="org_name")
    private String orgName;

    @Column(name="status")
    private String status;

    public Integer getOrgId() { return orgId; }
    public void setOrgId(Integer orgId) { this.orgId = orgId; }

    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) { this.orgName = orgName; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}