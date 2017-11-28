package net.sambuca.basepatterns.behavioral.observer;

import java.util.List;

/**
 * Created by smb on 28.11.2017.
 */
public interface Observer {
    public void handleEvent(List<String> vacancies);
}
