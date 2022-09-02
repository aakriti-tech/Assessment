package com.globallogic.Assessment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Assessment.entity.AdminEntity;

public interface AdminRepo extends JpaRepository<AdminEntity, Integer> {

}
