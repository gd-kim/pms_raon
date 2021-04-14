package com.raonse2.pms.repository;

import com.raonse2.pms.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmpRepository extends JpaRepository<Emp, String>{
}
