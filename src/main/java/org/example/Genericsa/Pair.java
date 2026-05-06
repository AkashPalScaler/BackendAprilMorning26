package org.example.Genericsa;

public class Pair <S,V>{
    S first;
    V second;

    public Pair() {
    }

    public Pair(S first, V second) {
        this.first = first;
        this.second = second;
    }

    public S getFirst() {
        return first;
    }

    public void setFirst(S first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
