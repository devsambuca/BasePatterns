package net.sambuca.homework.behavioral.observer;

public class SpaceDisplay implements Observer {
    Observable subject;

    @Override
    public void update(Object o){
        if (o instanceof SpaceShipData){
            SpaceShipData data = (SpaceShipData) o;
            System.out.println("Current velocity: "+data.getCurrentVelocity());
            System.out.println("Coordinates: X="+data.getCoords()[0]+
                    " Y="+data.getCoords()[1]+
                    " Z="+data.getCoords()[2]);
            System.out.println("Shield status: "+data.getShieldStatus());
        }
    }

    public SpaceDisplay(Observable o){
        subject = o;
        subject.addObserver(this);
    }

    public void unSubscribe(){
        subject.deleteObserver(this);
        subject = null;
    }
}