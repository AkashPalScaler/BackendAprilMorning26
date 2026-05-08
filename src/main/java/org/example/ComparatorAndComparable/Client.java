package org.example.ComparatorAndComparable;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(3,2,4,56,1,6));
        Collections.sort(nums);
        System.out.println(nums);
        // 1, 2, 4


        List<Item> items = new ArrayList<>(List.of(
                new Item("1", "iphone15", 1200, 10),
                new Item("2", "airpods2", 900, 15),
                new Item("3", "ipad11", 1500, 8),
                new Item("4", "iphone17", 1800, 9),
                new Item("5", "mac", 2500, 2)
        ));
        Collections.sort(items); // It is internally used by sort function
        for(Item item : items){
            System.out.println(item.getId());
        }
        System.out.println("****************");
        Collections.sort(items, new ItemQuantityComparator()); // It is internally used by sort function
        for(Item item : items){
            System.out.println(item.getId());
        }

        // Anonymous class
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getQuantity() - o2.getQuantity();
            }
        });

        //Lambda class
        Collections.sort(items, (Item o1, Item o2) -> {
            return o1.getQuantity() - o2.getQuantity();
        });
    }
}
