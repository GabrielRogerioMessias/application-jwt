package com.messias.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messias.domain.Category;
import com.messias.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository cRepository;

	public void delete(Integer idCategory) {
		Category categoryRemove = cRepository.getReferenceById(idCategory);
		cRepository.delete(categoryRemove);
	}

	public List<Category> findAll() {
		return cRepository.findAll();
	}

	public Category findById(Integer idCategory) {
		Optional<Category> category = cRepository.findById(idCategory);
		return category.get();
	}

	public Category insert(Category newCat) {
		return cRepository.save(newCat);
	}

	public void updateData(Category oldCat, Category newCat) {
		oldCat.setName(newCat.getName());
	}

	public Category update(Integer idOldCategory, Category newCategory) {
		Category oldCategory = cRepository.findById(idOldCategory).get();
		this.updateData(oldCategory, newCategory);
		return cRepository.save(oldCategory);
	}
}
