package net.sambuca.homework.behavioral.template;

public abstract  class TemplateGame {

    public abstract void initialize();
    public abstract void startGame();
    public abstract void endGame();

    public final void run() {
        initialize();
        startGame();
        endGame();
    }
}
