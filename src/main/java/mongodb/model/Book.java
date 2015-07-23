package mongodb.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="book")
public class Book extends DbEntity {

	public String name;
	
	@DBRef
	public Category category;
	
	public Book() { }
	
	public Book(String name, Category c) {
		this.name = name;
		this.category = c;
	}
	
}
