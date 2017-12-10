package net.sambuca.homework.creational.factory.factoryEx1;

/**
 * Created by smb on 08.12.2017.
 */
public class RunTestFactory {
    public static void main(String[] args){
        log(">Start test for Factory pattern");
        //тут будут вызываться тесты
        RunTestFactoryEx1.main(new String[]{"win"});
        RunTestFactoryEx1.main(new String[]{"linux"});
        RunTestFactoryEx1.main(new String[]{"mac"});
        log("==");
    }

    public static void log(String msg){ //А это для вывода сообщений в консоль, для удобства
        if(msg==null)
            msg = "null";
        System.out.println(msg);
    }
}
