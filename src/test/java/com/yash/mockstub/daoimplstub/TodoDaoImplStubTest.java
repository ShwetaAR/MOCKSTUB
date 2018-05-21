package com.yash.mockstub.daoimplstub;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.yash.mockstub.dao.ToDoDAO;
import com.yash.mockstub.daoImpl.TodoDaoImplStub;
import com.yash.mockstub.model.ToDo;

public class TodoDaoImplStubTest {

	@Test
	public void listTodo_ShouldReturnListOfTodo() {
		ToDoDAO toDoDAO = new TodoDaoImplStub();
		 List<ToDo> toDos= toDoDAO.listTodos();
		 
	}

}
