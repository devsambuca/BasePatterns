package net.sambuca.homework.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {

    List<Observer> observers = new ArrayList<Observer>();
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObservers();
}
