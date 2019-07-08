package com.infobelt.aadhaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infobelt.aadhaar.pojo.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository  extends JpaRepository<Task, Long> {
}