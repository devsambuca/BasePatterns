package net.sambuca.basepatterns.behavioral.observer;

/**
 * Created by smb on 28.11.2017.
 */
public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
