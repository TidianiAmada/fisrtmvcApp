package com.saraya.form;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos= new ArrayList<Todo>();
	static {
		todos.add(new Todo(1,"babacar","Spring Mvc", new Date(), false));
		todos.add(new Todo(2,"tidiani","Angular", new Date(), false));
		todos.add(new Todo(3,"babacar","Spring Boot", new Date(), false));
		todos.add(new Todo(4,"tidiani","AWS", new Date(), false));
	}
	List<Todo> theTDL= new ArrayList<Todo>();
	public List<Todo> retrieveAll(String username) {
		for(Todo todo:todos) {
			if(todo.getUsername().equalsIgnoreCase(username)) {
				theTDL.add(todo);
			}
		}
		return theTDL;
	}

}
