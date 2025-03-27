package com.crud.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.model.ToDoList;
import com.crud.demo.repository.ToDoAppRepository;
import com.crud.demo.service.ToDoAppService;



@Service
public class ToDoServiceImpl implements ToDoAppService {
	@Autowired
	private ToDoAppRepository toDoAppRepository;

	@Override
	public void saveTodo(ToDoList todolist) {
		 toDoAppRepository.save(todolist);
		
	}

	@Override
	public void getById() {
		toDoAppRepository.findAll();
		
	}

	@Override
	public List<ToDoList> getList() {
		
		return toDoAppRepository.findAll();
	}

	

}
