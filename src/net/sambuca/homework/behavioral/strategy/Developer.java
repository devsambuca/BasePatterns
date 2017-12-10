package net.sambuca.homework.behavioral.strategy;

public class Developer {
    public Coding codingType;

    public String tryToCoding() {
        return codingType.writeCode();
    }
    public void setCodingAbility(Coding newCodeType) {
        codingType = newCodeType;
    }
}
