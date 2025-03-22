package edu.rit.sec603w7d1;


import edu.rit.sec603w7d1.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();
    private Long idCounter = 1L;

    // Initialize some sample data
    public ProductRepository() {
        productList.add(new Product(idCounter++, "Samsung", 100, 800.0));
        productList.add(new Product(idCounter++, "iPhone", 50, 1200.0));
        productList.add(new Product(idCounter++, "Sony", 75, 700.0));
        productList.add(new Product(idCounter++, "Xiaomi", 120, 400.0));
    }

    // Get all products
    public List<Product> findAll() {
        return productList;
    }

    // Find product by ID
    public Optional<Product> findById(Long id) {
        return productList.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    // Find products by name (containing the search string)
    public List<Product> findByName(String name) {
        return productList.stream()
                .filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Save a new product
    public Product save(Product product) {
        if (product.getId() == null) {
            product.setId(idCounter++);
            productList.add(product);
        } else {
            // Update existing product
            deleteById(product.getId());
            productList.add(product);
        }
        return product;
    }

    // Delete a product by ID
    public boolean deleteById(Long id) {
        int initialSize = productList.size();
        productList.removeIf(product -> product.getId().equals(id));
        return productList.size() < initialSize;
    }
}