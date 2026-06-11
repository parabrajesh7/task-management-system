package com.rajesh.task_management_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajesh.task_management_api.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
