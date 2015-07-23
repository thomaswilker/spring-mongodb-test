package mongodb.controller;

import java.util.List;

import mongodb.model.Book;
import mongodb.model.Category;
import mongodb.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/book")
@RestController
public class BookController extends CrudController<Book> {

	@Autowired
	CategoryRepository categoryRepository;
	
	@RequestMapping(value = "/addOne")
	public Book init(@RequestParam(value = "name", required = true) String name) {
		
		Book b = new Book(name, categoryRepository.findFirstByOrderByNameAsc());
		return repository.save(b);
	}

}
