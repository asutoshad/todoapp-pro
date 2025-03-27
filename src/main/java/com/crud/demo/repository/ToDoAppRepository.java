package com.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo.model.ToDoList;



public interface ToDoAppRepository extends JpaRepository<ToDoList, Integer> {

}
