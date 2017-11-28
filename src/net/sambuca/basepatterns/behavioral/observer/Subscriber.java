package net.sambuca.basepatterns.behavioral.observer;

import java.util.List;

/**
 * Created by smb on 28.11.2017.
 */
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies +
                "\n==========================================================\n");
    }
}
