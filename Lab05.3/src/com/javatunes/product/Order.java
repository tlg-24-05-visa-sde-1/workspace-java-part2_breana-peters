/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import com.javatunes.billing.TaxCalculator;

import java.util.Collection;

public class Order {
    private String id;
    private double cost;
    private location location;

    public Order(String id, Location location) {
        this.id = id;
        this.location = location;
    }

    // We have three options to delegate to a TaxCalculator strategy:
    // 1.direct instantiation (NOT a good option here)
    /*
    if (getLocation() == Location.USA)
    new USATax(); ....

    2.call out to a factory eg TaxCalculatorFactory and "ask" for it (passing indicators)
    let some other party inject it into me and Ill store it in another field private TaxCalculator calc
     */


    public double getTax(){
        TaxCalculator calc = TaxCalculatorFactory.getTaxCalculator();
        return calc.taxAmount(getCost());
    }



    /**
     * DONE:
     * get the items from the cart and iterate over them, print each item's product code
     * get cart total and print
     */
    public void processCart(ShoppingCart<? extends Product> cart) {
        System.out.println("Order: " + getId() + " contains the following:");

        Collection<? extends Product> cartItems = cart.allItems();
        for (Product product : cartItems) {
            System.out.println(product.getCode());
        }
        System.out.println("Order Total: " + cart.total());
    }

    public String getId() {
        return id;
    }
    private double getCost() {
    }

}