package edu.rit.sec603w7d1;



public class Product {
    private Long id; // allows you to enter 64 bits integers which a string does not allow u to
    private String name;
    private int quantity;
    private double price;

    // Constructor
    public Product() {  // this is like the product that you created as default constructor where sometimes objects will not have values
    }

    // this is the real product with things you want to include
    public Product(Long id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

