package org.example.DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage bev = new Cream(null);

        Beverage b = new HouseBlend();
        b = new Milk(b);
        b = new Milk(b);
        b = new Cream(b);

        System.out.println("Cost  : " + b.getCost());
        System.out.println("Description :" + b.getDescription());
    }
}
// cream (base -> milk(base -> milk(base -> HouseBlend)))
