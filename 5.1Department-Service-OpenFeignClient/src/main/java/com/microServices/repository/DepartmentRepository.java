package com.microServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microServices.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}