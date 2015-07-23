package mongodb.controller;

import mongodb.model.Category;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/category")
@RestController
public class CategoryController extends CrudController<Category> {

	
	@RequestMapping(value="/addOne")
	public Category init(@RequestParam(value="name", required=true) String name) {
		return repository.save(new Category(name));
	}
	
}
