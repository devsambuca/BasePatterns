package net.sambuca.homework.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {

    List<Observer> observers = new ArrayList<Observer>();
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver();
}
