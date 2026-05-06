package org.example.ComparatorAndComparable;

import java.util.Comparator;

public class ItemQuantityComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        // Return -ve/0 it will not swap
        // Return +ve it will swap
        // o1, o2
        return o1.getQuantity() - o2.getQuantity();
    }
}
