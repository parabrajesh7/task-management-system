package com.rajesh.task_management_api.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.task_management_api.Entity.Task;
import com.rajesh.task_management_api.Repository.TaskRepository;

@RestController
@RequestMapping("taskMgmt")
public class TaskMgmtController {
	
	private TaskRepository taskRepository;
	
	
	@GetMapping("/health")
	public ResponseEntity healthCheck() {
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@PostMapping
	public Task saveData(@RequestBody Task task) {
		
		return taskRepository.save(task);
		
	}

}
