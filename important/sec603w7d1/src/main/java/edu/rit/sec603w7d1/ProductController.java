package edu.rit.sec603w7d1;

import edu.rit.sec603w7d1.Product;

import edu.rit.sec603w7d1.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET all products
    @GetMapping

    //ResponseEntity is a class in Spring (used in web applications) that represents an HTTP response. It allows you to
    // control what you send back to the client (e.g., the browser or any system making the request), like:
    //The status (e.g., success, error).
    //The body (the actual data you're sending).
    //The headers (extra information, like type of data, etc.)

    //ResponseEntity is like the cashier’s response to you. It tells the computer how to respond to someone’s request (like asking for a toy). The response can either be:
    //Success (like when the toy is given).
    //Failure (like when the toy is not available).

    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    // GET product by ID
    @GetMapping("/{id}")
    //@PathVariable is used to get values directly from the URL path. These are part of the actual URL, not in the query string,
    // and they are used to represent something specific in the URL.
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = productService.getProductById(id);
        return product.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET products by name
    //@RequestParam (Request Parameter)
    //@RequestParam is used to get parameters from the query string of the URL (the part after the ?). These are usually
    // used to pass extra information when you make a request.
    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProductsByName(@RequestParam String name) {
        return ResponseEntity.ok(productService.findProductsByName(name));
    }

    // POST (create) a new product
    // ResponseEntity (a package that holds the response information) with a Product object inside.
    //the @RequestBody annotation tells Spring to take the data sent by the user in the body of the request
    // (usually in JSON format) and turn it into a Product object.
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        //HttpStatus.CREATED is a special HTTP status code that means ("Everything went well, and a new resource (like a product) " +
        // "was created!"). This code is 201.
        return ResponseEntity.status(HttpStatus.CREATED)
                //This wraps the saved product inside the response body. The person who sent the request will now get back a
                // response that contains the new product they created (with its details).
                .body(productService.saveProduct(product));
    }

    // PUT (update) a product
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(id, product);
        if (updatedProduct != null) {
            return ResponseEntity.ok(updatedProduct);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE a product
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        boolean deleted = productService.deleteProduct(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


