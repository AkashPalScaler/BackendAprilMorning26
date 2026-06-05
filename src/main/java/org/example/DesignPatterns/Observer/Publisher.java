package org.example.DesignPatterns.Observer;

public interface Publisher {
    void register(Observer o);
    void unregister(Observer o);
    void notifyAllObservers();
}
