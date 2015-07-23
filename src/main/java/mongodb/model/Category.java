package mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="category")
public class Category extends DbEntity {
	
	public String name;
	
	public Category(String name) {
		this.name = name;
	}
	
}
