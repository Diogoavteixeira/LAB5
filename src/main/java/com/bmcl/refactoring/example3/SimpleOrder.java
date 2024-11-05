package com.bmcl.refactoring.example3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleOrder {
    private Discount discount;
    private double price;

    public SimpleOrder(double price) {
        this.price = price;
        this.discount = new NoDiscount();
    }
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    public double getTotal() {
        return discount.applyDiscount(price);
    }
}
