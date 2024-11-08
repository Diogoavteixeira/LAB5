package com.bmcl.refactoring.example1;

public class OrderLine {
    private Product product;
    private int quantity;
    public Product getProduct(){
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getTotal(){
        return getProduct().getPrice()*getQuantity();
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return getProduct().getName() + "(x" + getQuantity() + "):" + (getTotal());
    }
}
