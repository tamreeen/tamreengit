package edu.rit.sec603w7d1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController { // for controller

    private final ProductService productService;
    // calling out the service


    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    // calling out the constructor


    @GetMapping("/products") // call out the list's name
    public String products(Model model) { // enter the new string and it's name
        List<Product> products = this.productService.findAll(); // call out the list and the service to find all
        model.addAttribute("products", products);
        // call out addattribute, where products is the name of the items in the list, and product is the list name
        return "products"; // over here u return the list
    }

    @PostMapping("/products") // this is for when u add a new item the website will take ur information
    public String addProducts( // add the string name
            @RequestParam int id, // mention all the strings
            @RequestParam String productName,
            @RequestParam float productPrice,
            Model model) { // do not forget to add model model

        Product product = new Product(id, productName, productPrice);
        // call out the class and its item, new product is for new objects
        this.productService.addProduct(product); // call out the service, product is for new product
        var products = this.productService.findAll(); // place the product service inside a container
        model.addAttribute("products", products); // add the products
        return "products";
    }

}


