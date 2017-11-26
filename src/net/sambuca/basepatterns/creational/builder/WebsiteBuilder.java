package net.sambuca.basepatterns.creational.builder;

/**
 * Created by smb on 27.11.2017.
 */
public class WebsiteBuilder {
    public static void main(String[] args) {
        Website website = new Website();
        website.setName("Visit card");
        website.setCms("Wordpress");
        website.setPrice(500);

        System.out.println(website);
    }
}
