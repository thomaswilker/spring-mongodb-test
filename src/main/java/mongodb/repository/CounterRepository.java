package mongodb.repository;

import mongodb.model.Counter;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CounterRepository extends MongoRepository<Counter, String>  {

	
	public Counter findFirstByName(String name);
	
}
