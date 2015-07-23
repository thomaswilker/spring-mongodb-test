package mongodb.repository;

import mongodb.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String>  {

	public Category findFirstByOrderByNameAsc();
}
