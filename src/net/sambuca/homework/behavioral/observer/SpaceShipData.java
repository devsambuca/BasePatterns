package net.sambuca.homework.behavioral.observer;

public class SpaceShipData implements Observable {
    public static int SHIELD_ON = 0;
    public static int SHIELD_OFF = 1;

    int currentVelocity;
    int shieldStatus = SHIELD_ON;
    int[] coords = new int[3];

    public void setParameters(int velocity, int shield, int[] coords) {
        this.currentVelocity = velocity;
        this.shieldStatus = shield;
        this.coords = coords;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getShieldStatus() {
        return shieldStatus;
    }

    public int[] getCoords() {
        return coords;
    }
}

