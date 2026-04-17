package com.klu.service;
import com.klu.entity.product;
import java.util.List;
public interface ProductService {
List<product> getAllProducts();
product getProductById(Long id);
product saveProduct(product product);
product updateProduct(Long id, product product);
void deleteProduct(Long id);
}
