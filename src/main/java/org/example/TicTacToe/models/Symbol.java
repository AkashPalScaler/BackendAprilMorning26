package org.example.TicTacToe.models;

public class Symbol {
    Character sym;
    String color;

    public Symbol(Character sym) {
        this.sym = sym;
    }

    public Character getSym() {
        return sym;
    }

    public void setSym(Character sym) {
        this.sym = sym;
    }
}
