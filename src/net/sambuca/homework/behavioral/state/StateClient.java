package net.sambuca.homework.behavioral.state;

/**
 * Created by smb on 06.12.2017.
 */
public class StateClient {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.refill(100);
        atm.widthdraw(50);
        atm.widthdraw(30);
        atm.widthdraw(30);
        atm.widthdraw(20);
        atm.refill(50);
        atm.widthdraw(50);
    }
}
