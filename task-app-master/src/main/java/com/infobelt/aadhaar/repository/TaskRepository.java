package com.infobelt.aadhaar.repository;

import org.springframework.data.repository.CrudRepository;

import com.infobelt.aadhaar.pojo.Todo;

public interface TaskRepository  extends CrudRepository<Todo, Integer> {
}