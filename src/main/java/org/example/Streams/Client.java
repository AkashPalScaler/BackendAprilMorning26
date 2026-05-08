package org.example.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(2, 4,3,1,5,1,6,3,4,2,7,8,7,1,6,3));
        List<String> stringnums = new ArrayList<>();
        nums.stream()
                .distinct()
                .sorted()
                .forEach((x) -> {
                    System.out.print(x + ", ");
                });
        System.out.println();

        List<Integer> newnums = new ArrayList<>();
        nums.stream()
                .distinct()
                .sorted()
                .forEach((x) -> {
                    newnums.add(x);
                });

        List<Integer> newnums2 = nums.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> newnums3 = nums.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(newnums3);

        Long countNums = nums.stream()
                .distinct()
                .sorted()
                .count();

        System.out.println(countNums);

        // Filter, Map, Reduce
        List<Integer> newnums4 = nums.stream()
                .distinct()
                .filter((x) -> {
                    return x%2==0;
                })
                .sorted()
                .toList();
        System.out.println(newnums4);

        List<String> newnums5 = nums.stream()
                .distinct()
                .filter((x) -> {
                    return x%2==1;
                })
                .sorted()
                .map((x) -> {
                    if(x == 2){
                        return "two";
                    }else if(x == 4){
                        return "four";
                    }else{
                        return "Unknown";
                    }
                })
                .toList();

        System.out.println(newnums5);

        // Lazy evaluation
        // Short circuiting
        List<Integer> newnums6 = nums.stream()
                .distinct()
                .filter((x) -> {
                    System.out.println("Filtering -> " + x);
                    return x%2==1; // odd number
                })
//                .sorted()
                .map((x) -> {
                    System.out.println("Mapping -> " + x);
                    return x*x;
                })
                .limit(2)
                .toList();
    }
}
