package mongodb.repository;

import mongodb.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, String> {

	
}
