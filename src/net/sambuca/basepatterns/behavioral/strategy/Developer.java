package net.sambuca.basepatterns.behavioral.strategy;

/**
 * Created by smb on 27.11.2017.
 */
public class Developer {
    Activity activity;

    public void setActivity(Activity activity){
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
