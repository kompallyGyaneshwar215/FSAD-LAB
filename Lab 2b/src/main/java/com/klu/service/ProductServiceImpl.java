package com.klu.service;
import com.klu.entity.product;
import com.klu.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {
private final ProductRepository productRepository;
//Constructor-based Dependency Injection
public ProductServiceImpl(ProductRepository productRepository) {
this.productRepository = productRepository;
}
@Override
public List<product> getAllProducts() {
return productRepository.findAll();
}
@Override
public product getProductById(Long id) {
return productRepository.findById(id)
.orElseThrow(() -> new RuntimeException("Product not found"));
}
@Override
public product saveProduct(product product) {
return productRepository.save(product);
}
@Override
public product updateProduct(Long id, product productDetails) {
product existingProduct = getProductById(id);
existingProduct.setName(productDetails.getName());
existingProduct.setDescription(productDetails.getDescription());
existingProduct.setPrice(productDetails.getPrice());
existingProduct.setQuantity(productDetails.getQuantity());
return productRepository.save(existingProduct);
}
@Override
public void deleteProduct(Long id) {
productRepository.deleteById(id);
}
}