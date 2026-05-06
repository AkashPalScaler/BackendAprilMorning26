package org.example.Collectionas;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        //    Collection
        // List, Queue, Set


        //List
        // Ordered collection
        // Random access through index
        // Allows duplicate

        // Lists can be implemented by 4 things
        // Array, LinkedList, Vector, Stack

        //ArrayList
        //Insertion at end TC - O(1) (Amortized time constant) | start/middle - O(n)
        //Random access TC - O(1)
        List<Integer> list1 = new ArrayList<>();

        //Insertion at start/end TC - O(1) | middle - O(n)
        //Random access TC - O(n)
        List<Integer> list2 = new LinkedList<>();

        //Thread safe list, growth is your control -> deprecated
        List<Integer> vector1 = new Vector<>();
        // Thread safe,works LIFO and extends vector
        List<Integer> stack1 = new Stack<>();

        //Queue - PriorityQueue - It follows priority based queueing
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }

        Deque<Integer> dq = new ArrayDeque<>(); //Underlying DS is array
        Deque<Integer> dq1 = new LinkedList<>(); // Underlying DS is linkedlist


        //Set
        //It allows no duplicate items
        // HashSet, LinkedHashSet, TreeSet

        //HashSet - Unordered - Random order
        Set<Integer> hset = new HashSet<>();
        hset.add(41);
        hset.add(8);
        hset.add(63);
        hset.add(31);
        hset.add(21);
        hset.add(7);

        System.out.println(hset);

        // LinkedHashSet -> Linked + Hashmap -> Insertion order
        Set<Integer> lset = new LinkedHashSet<>();
        lset.add(41);
        lset.add(8);
        lset.add(63);
        lset.add(31);
        lset.add(21);
        lset.add(7);

        System.out.println(lset);

        // Treeset - Natural order - RnB Trees
        Set<Integer> tset = new TreeSet<>(); //Collections.reverseOrder for reverse natural order
        tset.add(41);
        tset.add(8);
        tset.add(63);
        tset.add(31);
        tset.add(21);
        tset.add(7);

        System.out.println(tset);

        // Map - These are ordered by keys
        // HashMap, LinkedHashMap, TreeMap

        //HashMap - unordered keys
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(41, 10);
        map1.put(14, 10);
        map1.put(20, 10);
        map1.put(49, 10);
        map1.put(11, 10);
        map1.put(31, 10);

        System.out.println(map1);

        // LinkedHashMap
        Map<Integer, Integer> map2 = new LinkedHashMap<>();
        map2.put(41, 10);
        map2.put(14, 10);
        map2.put(20, 100);
        map2.put(49, 10);
        map2.put(11, 10);
        map2.put(31, 10);

        System.out.println(map2);

        Map<Integer, Integer> map3 = new TreeMap<>();
        map3.put(41, 10);
        map3.put(14, 10);
        map3.put(20, 100);
        map3.put(49, 10);
        map3.put(11, 10);
        map3.put(31, 10);

        System.out.println(map3);


    }
}
