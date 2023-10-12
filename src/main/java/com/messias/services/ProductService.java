package com.messias.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messias.domain.Category;
import com.messias.domain.Product;
import com.messias.repositories.CategoryRepository;
import com.messias.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository pRepository;

	@Autowired
	CategoryRepository categoryRepository;

	public void delete(Integer idProduct) {
		Product productRemove = pRepository.getReferenceById(idProduct);
		pRepository.delete(productRemove);
	}

	public List<Product> findAll() {
		return pRepository.findAll();
	}

	public Product findById(Integer idUser) {
		Optional<Product> product = pRepository.findById(idUser);
		return product.get();
	}

	public Product insert(Product newProduct) {
		Integer idCategory = newProduct.getCategory().getId();
		Category categoryPro = categoryRepository.findById(idCategory).get();
		categoryPro.getProducts().add(newProduct);
		newProduct.setCategory(categoryPro);
		return pRepository.save(newProduct);
	}

	public void updateData(Product oldProd, Product newProd) {
		oldProd.setName(newProd.getName());
		oldProd.setQuantity(newProd.getQuantity());
		oldProd.setValueProduct(newProd.getValueProduct());
	}

	public Product update(Integer idOldProduct, Product newProduct) {
		Product oldProduct = pRepository.findById(idOldProduct).get();
		this.updateData(oldProduct, newProduct);
		return pRepository.save(oldProduct);
	}
}
