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

import com.messias.domain.Product;
import com.messias.services.ProductService;

@RestController
@RequestMapping(value = "product")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping(value = "/{idProduct}")
	public ResponseEntity<Product> findById(@PathVariable Integer idProduct) {
		Product product = productService.findById(idProduct);
		return ResponseEntity.ok().body(product);
	}

	@GetMapping(value = "/all")
	public ResponseEntity<List<Product>> findAll() {
		List<Product> listProducts = productService.findAll();
		return ResponseEntity.ok().body(listProducts);
	}

	@DeleteMapping(value = "/del/{idProduct}")
	public ResponseEntity<Void> delete(@PathVariable Integer idProduct) {
		productService.delete(idProduct);
		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "/update/{idProduct}")
	public ResponseEntity<Product> update(@PathVariable Integer idProduct, @RequestBody Product productUpdate) {
		Product product = productService.findById(idProduct);
		productService.update(idProduct, productUpdate);
		return ResponseEntity.ok().body(product);
	}

	@PostMapping(value = "/insert")
	public ResponseEntity<Product> insert(@RequestBody Product newProduct) {
		Product product = productService.insert(newProduct);
		String uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(newProduct.getId())
				.toString();
		return ResponseEntity.created(URI.create(uri)).body(product);

	}

}
