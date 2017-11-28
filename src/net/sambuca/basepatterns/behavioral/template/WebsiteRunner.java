package net.sambuca.basepatterns.behavioral.template;

public class WebsiteRunner {
    public static void main(String[] args) {
        TemplatePage welcomePage = new WelcomePage();
        TemplatePage newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("\n==============================================\n");
        newsPage.showPage();
    }
}
