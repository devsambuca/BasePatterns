package net.sambuca.homework.behavioral.observer;

/**
 * Created by smb on 13.12.2017.
 */
public class MKS {
    public static void main(String[] args){
        SpaceShipData spaceShipData = new SpaceShipData();
        SpaceDisplay spaceDisplay = new SpaceDisplay(spaceShipData);

        spaceShipData.setParameters(0,SpaceShipData.SHIELD_ON,new int[]{0,0,0});
        spaceShipData.setParameters(100,SpaceShipData.SHIELD_OFF,
                new int[]{1000,300,100});
        spaceDisplay.unSubscribe();
       spaceShipData.setParameters(100000,SpaceShipData.SHIELD_ON,
               new int[]{500000,780,123});
       spaceDisplay.update(spaceShipData);
    }
}

