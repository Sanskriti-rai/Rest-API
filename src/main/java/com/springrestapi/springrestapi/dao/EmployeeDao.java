package com.springrestapi.springrestapi.dao;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.springrestapi.springrestapi.entities.Employee;

@Repository
@EntityScan("com.springrestapi.springrestapi.entities")
@EnableJpaRepositories("com.springrestapi.springrestapi.dao")
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
