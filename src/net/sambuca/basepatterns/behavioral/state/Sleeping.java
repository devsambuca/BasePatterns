package net.sambuca.basepatterns.behavioral.state;

import net.sambuca.basepatterns.behavioral.strategy.Activity;

/**
 * Created by smb on 27.11.2017.
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
