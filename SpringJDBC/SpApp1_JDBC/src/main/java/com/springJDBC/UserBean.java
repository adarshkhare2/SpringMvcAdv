package com.springJDBC;

import org.springframework.jdbc.core.JdbcTemplate;
//CRUD 
public class UserBean {
	// Field
	private JdbcTemplate template;

	// Setter
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	// Business method (CRUD)

	public void createBookTable() {
		String query = "create table books(isbn int primary key, name varchar(40), cost int)";
		template.execute(query);
		System.out.println("Book Table sucessfully created");
	}

	public void insertBookTable() {
		//String query = "insert into books values(\"1\",\"life of pie\",\"200\");";
		String query = "insert into books values('3','GOT','400');";

		template.execute(query);
		System.out.println("Book Table sucessfully inserted");
	}
	public void updateBookTable() {
		String query = "update  books set isbn = '2';";
		template.execute(query);
		System.out.println("Book Table sucessfully updated");
	}
	public void deleteBookTable() {
		String query = "drop table books;";
		template.execute(query);
		System.out.println("Book Table sucessfully deleted");
	}

}
