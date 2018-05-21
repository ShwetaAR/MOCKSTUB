package com.yash.mockstub.model;

public class ToDo {
	private String todoTitle;

	public ToDo(String todoTitle) {
		super();
		this.todoTitle = todoTitle;
	}

	public String getTodoTitle() {
		return todoTitle;
	}

	@Override
	public String toString() {
		return "ToDo [todoTitle=" + todoTitle + "]";
	}

}
