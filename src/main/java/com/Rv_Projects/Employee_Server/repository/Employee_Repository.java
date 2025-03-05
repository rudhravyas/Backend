package com.Rv_Projects.Employee_Server.repository;

import com.Rv_Projects.Employee_Server.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee_Repository extends JpaRepository<Employee,Long> {
}
