package com.crud.demo.service;

import java.util.List;

import com.crud.demo.model.ToDoList;

public interface ToDoAppService {

	void saveTodo(ToDoList todolist);
	void getById();
	List<ToDoList> getList();
}
