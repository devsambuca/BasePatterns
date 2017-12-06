package net.sambuca.homework.behavioral.state;

/**
 * Created by smb on 06.12.2017.
 */
public class Atm implements AtmState {

    int cashStock;
    AtmState currentState;

    public Atm() {
        currentState = new NoCash(this);
    }

    public int getCashStock() {
        return cashStock;
    }

    public void setCashStock(int CashStock) {
        this.cashStock = CashStock;
    }

    public void setState(AtmState state) {
        currentState = state;
    }

    public AtmState getState() {
        return currentState;
    }

    @Override
    public void widthdraw(int amount) {
        currentState.widthdraw(amount);
    }

    @Override
    public void refill(int amount) {
        currentState.refill(amount);
    }
}
