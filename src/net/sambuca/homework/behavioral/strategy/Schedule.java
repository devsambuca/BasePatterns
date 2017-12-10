package net.sambuca.homework.behavioral.strategy;

public class Schedule {
    public static void main(String[] args) {

        Developer devJava = new DeveloperJava();
        Developer devPHP = new DeveloperPHP();

        System.out.println("Developer Java: " + devJava.tryToCoding());
        System.out.println("Developer PHP: " + devPHP.tryToCoding());

        devJava.setCodingAbility(new WritingCodePHP());
        System.out.println("Developer Java: " + devJava.tryToCoding());

        devPHP.setCodingAbility(new WritingCodeJava());
        System.out.println("Developer PHP: " + devPHP.tryToCoding());
    }
}
