package net.sambuca.homework.behavioral.template;

/**
 * Created by smb on 15.12.2017.
 */
public class Game {
    public static void main(String[] args) {

        TemplateGame cs = new CsGO();
        TemplateGame dota = new Dota2();

        cs.run();
        System.out.println("++++++++++++++++++++++");
        dota.run();
    }
}
