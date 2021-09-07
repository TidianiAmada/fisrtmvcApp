package com.saraya.form;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;



@Service
public class TodoService {
	private static List<Todo> todos= new ArrayList<Todo>();
	public static int count=6;
	static {
		todos.add(new Todo(1,"babacar","Spring Mvc", new Date(), false));
		todos.add(new Todo(2,"tidiani","Angular", new Date(), false));
		todos.add(new Todo(3,"babacar","Spring Boot", new Date(), false));
		todos.add(new Todo(4,"tidiani","AWS", new Date(), false));
		todos.add(new Todo(5,"tidiani","React", new Date(), false));
		todos.add(new Todo(6,"tidiani","Azure", new Date(), false));
	}
	public List<Todo> theTDL= new ArrayList<Todo>();
	public List<Todo> retrieveAll(String username) {
//		for(Todo todo:todos) {
//			if(todo.getUsername().equalsIgnoreCase(username)) {
//				theTDL.add(todo);
//			}
//		}
		return todos;
	}
	
	public void addTodo(int id,String name, String desc,Date date,boolean isDone) {
		
		todos.add(new Todo(++count, name,desc, date,isDone));
	}
	public void deleteTodo(int id) {
//		ListIterator<Todo> it= todos.listIterator();
//		while(it.hasNext()) {
//			Todo ndiaye = it.next();
//			if(ndiaye.getId()==id) {
//				todos.remove(ndiaye);
//			}
//		
//		}
		Todo todo=findById(id);
		todos.remove(todo);
		
	}

	public Todo findById(int id) {
		// TODO Auto-generated method stub
		for(Todo todo:todos) {
			if(todo.getId()==id) {
				return todo;
			}
			
		}
		return null;
	}
	public void update(Todo todo,int previous_id,String desc) {
		Todo td=findById(previous_id);
		td.setDesc(desc);
	}
	}
