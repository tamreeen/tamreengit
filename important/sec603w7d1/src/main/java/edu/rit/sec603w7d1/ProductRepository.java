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



    // constructor

    //idCounter is the tool you use to generate IDs (like a counter that goes up each time a new product is added).
    public ProductRepository() {
        productList.add(new Product(idCounter++, "Samsung", 100, 800.0));
        productList.add(new Product(idCounter++, "iPhone", 50, 1200.0));
        productList.add(new Product(idCounter++, "Sony", 75, 700.0));
        productList.add(new Product(idCounter++, "Xiaomi", 120, 400.0));
    }

    // Get all products
    //One of the most common reasons for accessing a list of products is to display the product information to the user,
    // such as in a store or inventory management system.
    // For example, you might want to show all available products to the customer, or display a product catalog.
    public List<Product> findAll() {
        return productList;
    }

    // Find product by ID
    //The main reason for using Optional<Product> is to handle cases where the product might not exist in the productList.
    // In other words, the method is designed to return a product if it exists or indicate that no product was found.
    public Optional<Product> findById(Long id) {
        // stream is like a magic box that has tools like filter or findfirst, it makes easier for u to find a specific product
        return productList.stream()
                .filter(product -> product.getId().equals(id)) //getId means it gets the id of the current product in the list and it
                // checks if it matches the id you passed into method ( the id parameter) we need to use equals to make sure both id are same
                .findFirst();
        //looks through the filtered stream of products and returns the first product that matches the condition
    }

    // Find products by name (containing the search string)
    public List<Product> findByName(String name) {
        return productList.stream()
                // product refers to each product in the product list, it converts the product name to lowercase
                .filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
                //The contains() method returns true if the product name contains the search string, and false otherwise.

                //In Java, collect() takes the results of whatever you’ve been doing and puts them into a new container.
                .collect(Collectors.toList()); // puts in a list
    }

    // Save a new product
    public Product save(Product product) {

      //  This checks if the product has an ID. If the ID is null, it means this is a new product (not yet saved).

        if (product.getId() == null) {
            product.setId(idCounter++);
            productList.add(product);
        } else {
          //  By calling deleteById(product.getId()), you first remove the old product from the list (if it exists), so
           // that when you add the updated product, there’s only one version of that product in the list.
            deleteById(product.getId());
            productList.add(product);
        }
        return product;
    }

    // Delete a product by ID
    //Product Deletion is a common task in software, like when a user wants to delete a product from a store’s inventory
    // or remove an item from their cart.

    public boolean deleteById(Long id) {
        int initialSize = productList.size();
        // it checks the size of the product
        // removeIf() is a method that goes through the list of products and removes the products that match a condition.
        productList.removeIf(product -> product.getId().equals(id));
        return productList.size() < initialSize;
        //After trying to remove the product, this line checks if the list has shrunk (meaning a product was actually removed).
    }
}