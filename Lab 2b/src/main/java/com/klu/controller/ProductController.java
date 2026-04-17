package com.klu.controller;
import com.klu.entity.product;
import com.klu.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/products")
public class ProductController {
private final ProductService productService;
// Setter-based Dependency Injection
public ProductController(ProductService productService) {
this.productService = productService;
}
@GetMapping
public List<product> getAllProducts() {
return productService.getAllProducts();
}
@GetMapping("/{id}")
public ResponseEntity<product> getProductById(@PathVariable Long id) {
return ResponseEntity.ok(productService.getProductById(id));
}
@PostMapping
public ResponseEntity<product> createProduct(@RequestBody product product) {
return ResponseEntity.ok(productService.saveProduct(product));
}
@PutMapping("/{id}")
public ResponseEntity<product> updateProduct(@PathVariable Long id, @RequestBody
product productDetails) {
return ResponseEntity.ok(productService.updateProduct(id, productDetails));
}
@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
productService.deleteProduct(id);
return ResponseEntity.noContent().build();
}
}
