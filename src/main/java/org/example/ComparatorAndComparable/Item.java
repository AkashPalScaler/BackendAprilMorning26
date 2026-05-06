package org.example.ComparatorAndComparable;

public class Item implements Comparable<Item>{
    private String id;
    private String name;
    private double price; // The default parameter to compare the objects of this class
    private int quantity;

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Sorted by asc order of price - Increasing order
    @Override
    public int compareTo(Item other) {
        // Helps you to compare items for sorting
        // this, other | item1, item2, item3
        // Return -ve/0 it will not swap
        // Return +ve it will swap
//        if(this.price >= other.price){ // 15, 10
//            return 1; // return positive
//        }else{
//            return -1;
//        }
        return (int)this.price - (int)other.price;
    }
}