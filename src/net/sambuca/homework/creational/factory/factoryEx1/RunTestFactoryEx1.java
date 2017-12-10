package net.sambuca.homework.creational.factory.factoryEx1;

/**
 * Created by smb on 08.12.2017.
 */
public class RunTestFactoryEx1 extends RunTestFactory {
    public static void main(String[] args){
        log("----> Start Example 1");
        String currentOS = args[0];//получаем айдишник ОС
        Factory factory = new Factory(); //Инициализируем фабрику

        log("    OS id: [" + currentOS + "], creating client");
        Client client = factory.getClient(currentOS);//Инициализируем клиент типа Client

        if(client!=null){//Фабрика нашла подходящий клиент, хорошо
            log("    Client created for OS:");
            log(client.getTargetOS());//Конкретная реализация метода здесь не видна, что дает нам свободу
        }else{
            log("    No client!");
        }
        log("<---- Finish Example 1");
    }
}
