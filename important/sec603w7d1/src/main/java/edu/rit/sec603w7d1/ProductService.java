package edu.rit.sec603w7d1;

import edu.rit.sec603w7d1.Product;
import edu.rit.sec603w7d1.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get product by ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Find products by name
    public List<Product> findProductsByName(String name) {
        return productRepository.findByName(name);
    }

    // Save or update a product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Update a product
    public Product updateProduct(Long id, Product product) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null;
    }

    // Delete a product
    public boolean deleteProduct(Long id) {
        return productRepository.deleteById(id);
    }
}

