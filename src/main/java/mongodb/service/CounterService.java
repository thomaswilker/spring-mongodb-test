package mongodb.service;

import mongodb.model.Counter;
import mongodb.repository.CounterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class CounterService {

	@Autowired
	protected CounterRepository repository;
	
	
	public Counter getNextSequence(String collection) {
		
		Counter c = repository.findFirstByName(collection);
		
		if(c == null) {
			c = new Counter();
			c.collection = collection;
			c.count = 0l;
			c = repository.insert(c);
		}
		
		return c;
	}
	
}
