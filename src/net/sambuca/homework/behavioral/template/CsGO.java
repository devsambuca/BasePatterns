package net.sambuca.homework.behavioral.template;

public class CsGO extends TemplateGame {
    @Override
    public void initialize() {
        System.out.println("Cs: Global Offesnsive initialization");
    }

    @Override
    public void startGame() {
        System.out.println("Cs: Global Offesnsive loading...New game.");
    }

    @Override
    public void endGame() {
        System.out.println("Cs: Global Offesnsive Game Over!!!");
    }
}
