package edu.rit.sec603w7d1;

public class Product {  // change name of the class

    private int id;
    private String productName;
    private float productPrice;


    public Product(int id, String productName, float productPrice) {
        // constructor function that will allow you to add different types of objects
        this.productName = productName;
        this.productPrice = productPrice;
        this.id = id;
    }

    public float getProductPrice() {
        return productPrice;
    }
    public int getId() {
        return this.id;
    }
    public String getProductName() {
        return this.productName;
    }


    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product ID" + this.id + "\nProduct Name" + this.productName + "\nProduct Price" + this.productPrice;
    }
}
