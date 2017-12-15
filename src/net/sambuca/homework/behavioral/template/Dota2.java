package net.sambuca.homework.behavioral.template;

public class Dota2 extends TemplateGame {
    @Override
    public void initialize() {
        System.out.println("Dota 2: initialization ");
    }

    @Override
    public void startGame() {
        System.out.println("Dota 2: loading... New game. ");
    }

    @Override
    public void endGame() {
        System.out.println("Dota 2: Game Over!!! ");
    }
}
