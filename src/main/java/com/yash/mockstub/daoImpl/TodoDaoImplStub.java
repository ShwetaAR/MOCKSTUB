package com.yash.mockstub.daoImpl;

import java.util.Arrays;
import java.util.List;

import com.yash.mockstub.dao.ToDoDAO;
import com.yash.mockstub.model.ToDo;

public class TodoDaoImplStub implements ToDoDAO {

	public List<ToDo> listTodos() {
		
		return Arrays.asList(new ToDo("training poc "),new ToDo("training assignments "),new ToDo("new work related  poc "));
	}

}
