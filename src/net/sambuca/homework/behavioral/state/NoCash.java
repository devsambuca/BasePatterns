package net.sambuca.homework.behavioral.state;

/**
 * Created by smb on 06.12.2017.
 */
public class NoCash implements AtmState {
    Atm atm;

    public NoCash(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void widthdraw(int amount) {
        System.out.println("Out of cash");
    }

    @Override
    public void refill(int amount) {
        System.out.println(amount + "$ is loaded");
        atm.setState(new Working(atm));
        atm.setCashStock(atm.getCashStock() + amount);
    }
}
