package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Scholarship;

public interface ScholarshipDao extends JpaRepository<Scholarship, Integer> {

}