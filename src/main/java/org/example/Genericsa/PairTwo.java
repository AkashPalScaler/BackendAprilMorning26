package org.example.Genericsa;

import java.util.*;

public class PairTwo<S>{
    S first;
    S second;

    public PairTwo() {
    }

    public PairTwo(S first, S second) {
        this.first = first;
        this.second = second;
    }

    public S getFirst() {
        return first;
    }

    public void setFirst(S first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public void something(Integer x){
        System.out.println(x);
    }
}