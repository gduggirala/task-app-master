package com.infobelt.aadhaar.controller;

import com.infobelt.aadhaar.pojo.Task;
import com.infobelt.aadhaar.web.AbstractEntityResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/task")
public class TaskResource extends AbstractEntityResource<Task> {
}
