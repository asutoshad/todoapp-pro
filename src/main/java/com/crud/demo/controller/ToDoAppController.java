package com.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.model.ToDoList;
import com.crud.demo.service.ToDoAppService;

import ch.qos.logback.core.model.Model;


@CrossOrigin
@RestController
@RequestMapping("/todo")
public class ToDoAppController {
	@Autowired
	private ToDoAppService toDoAppService;
	
	
	@GetMapping({"","/"})
	public String test() {
		return "kk";
	}
	
	@GetMapping("/list")
	public String getList() {
		return "welcome to list";
	}
	
	@PostMapping("/add")
	public String addList(@RequestBody ToDoList toDoList, Model model) {
		 toDoAppService.saveTodo(toDoList);
		 return "Successfully Added";
	}
	
	@GetMapping("/getall")
	public List<ToDoList> getAll() {
		 return toDoAppService.getList();
	}
	


}
