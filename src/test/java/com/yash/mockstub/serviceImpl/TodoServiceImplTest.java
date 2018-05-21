package com.yash.mockstub.serviceImpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.yash.mockstub.dao.ToDoDAO;
import com.yash.mockstub.daoImpl.TodoDaoImplStub;
import com.yash.mockstub.model.ToDo;
import com.yash.mockstub.service.ToDoService;

public class TodoServiceImplTest {

	@Test
	public void listTrainingRelatedTodo_ShouldReturnTrainingRelatedTodo() {
		ToDoDAO toDoDao = new TodoDaoImplStub();
		ToDoService todoService = new TodoServiceImpl(toDoDao);
		List<ToDo> filteredTodos = todoService.listTrainingRelatedTodo("training");
		assertEquals(2, filteredTodos.size());
	}

}
