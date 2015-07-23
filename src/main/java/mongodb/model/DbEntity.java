package mongodb.model;

import org.springframework.data.annotation.Id;

abstract public class DbEntity {

	@Id
	protected Long id;

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
}
