package com.infobelt.aadhaar.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infobelt.aadhaar.pojo.Todo;
import com.infobelt.aadhaar.repository.TaskRepository;

@RestController
public class TaskController {

	@Autowired
	TaskRepository taskRepository;

	@RequestMapping(path = "/")
	public String home() {
		return "data done";
	}

	@RequestMapping(path = "/todo", method = RequestMethod.GET)
	public List<Todo> getTodos() {
		List<Todo> cltn = new ArrayList<Todo>();

		taskRepository.findAll().forEach(cltn::add);
		return cltn;
	}

	@RequestMapping(path = "/todo/{id}", method = RequestMethod.GET)
	public Todo getTodo(@PathParam("id") Integer id) {
		return taskRepository.findById(id).get();
	}
	
	@RequestMapping(path = "/todo}", method = {RequestMethod.PUT,RequestMethod.POST})
	public @ResponseBody Todo saveOrUpdateTodo(@RequestBody Todo todo) {
		return taskRepository.save(todo);
	}
	
	@RequestMapping(path = "/todo/{id}", method = RequestMethod.GET)
	public String deleteTodo(@PathParam("id") Integer id) {
		taskRepository.deleteById(id);
		return "success";
	}
}
