package org.example.Genericsa;

public class Client {
    public static void main(String[] args) {
        Pair<Integer, Integer> point = new Pair<>();
        point.setFirst(34);
        Pair<Integer, Object> point1 = new Pair<>(2, 34);
        Pair point2 = new Pair(2, 34);

        Pair<String, Integer> population = new Pair<>();
        population.setFirst("Mumbai");
        population.setSecond(47);

        Pair pair = new Pair();
        Pair<Object, Object> pair1= new Pair<>();
        pair.setFirst(5.0f);
        pair.setSecond(12);
        pair.setSecond("Akash");

        Object s = pair.getFirst();

        PairTwo<Integer> pairTwoObject = new PairTwo<>();
    }
}
