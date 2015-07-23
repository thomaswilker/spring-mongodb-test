package mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="counter")
public class Counter extends DbEntity {

	public String collection;
	public Long count;
	 
}
