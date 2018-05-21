package com.yash.mockstub.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.yash.mockstub.dao.ToDoDAO;
import com.yash.mockstub.model.ToDo;
import com.yash.mockstub.service.ToDoService;

public class TodoServiceImpl implements ToDoService {
	private ToDoDAO toDoDao;

	public TodoServiceImpl(ToDoDAO toDoDAO) {
		this.toDoDao = toDoDAO;
	}

	public List<ToDo> listTrainingRelatedTodo(String string) {
		List<ToDo> filteredTodo = new ArrayList<ToDo>();
		List<ToDo> toDo= toDoDao.listTodos();
		for (ToDo toDoss : toDo) {
			if(toDoss.getTodoTitle().contains(string)){
				filteredTodo.add(toDoss);
			}
		}
		return filteredTodo;
	}

}
