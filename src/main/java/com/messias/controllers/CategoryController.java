package com.messias.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.messias.domain.Category;
import com.messias.services.CategoryService;

@RestController
@RequestMapping(value = "category")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@GetMapping(value = "/{idCategory}")
	public ResponseEntity<Category> findById(@PathVariable Integer idCategory) {
		Category category = categoryService.findById(idCategory);
		return ResponseEntity.ok().body(category);
	}

	@PostMapping(value = "/insert")
	public ResponseEntity<Category> insert(@RequestBody Category newCategory) {
		Category category = categoryService.insert(newCategory);
		String uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(newCategory.getId())
				.toString();
		return ResponseEntity.created(URI.create(uri)).body(category);
	}

	@GetMapping(value = "/all")
	public ResponseEntity<List<Category>> findAll() {
		List<Category> category = categoryService.findAll();
		return ResponseEntity.ok().body(category);
	}

	@DeleteMapping(value = "/del/{idCategory}")
	public ResponseEntity<Void> delete(@PathVariable Integer idCategory) {
		categoryService.delete(idCategory);
		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "/update/{idCategory}")
	public ResponseEntity<Category> update(@PathVariable Integer idCategory, @RequestBody Category newCategory) {
		Category category = categoryService.update(idCategory, newCategory);
		return ResponseEntity.ok().body(category);
	}
}
