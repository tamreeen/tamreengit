package edu.rit.sec603w7d1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    // Product is the name of the Product class and products is the name of the new list
    // new ArrayList is important because u are making a list


    public List<Product> findAll() {
        return products;
    }

    // over here it will loop over all items in products

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
// over here u add new products

