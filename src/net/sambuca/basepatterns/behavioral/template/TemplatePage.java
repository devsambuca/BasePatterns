package net.sambuca.basepatterns.behavioral.template;

/**
 * Created by smb on 28.11.2017.
 */
public abstract class TemplatePage {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }
    public abstract void showPageContent();

}
