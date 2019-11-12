package ru.pavlenty;

import com.sun.javafx.collections.ElementObservableListDecorator;

public class Main {

    // функция и метод!!!
    // ООП - МЕТОД!!!
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setColor("Red");
        System.out.println(bmw.getColor());

        bmw.makeSound();

        Car opel = new Car();
        // Метод makeSound - перегружен (overload)
        opel.makeSound();
        opel.doMove();
        opel.makeSound("Opel bi-bi!!!");



        Car vw = new Car();
        Car toyota = new Car();
        Car vaz = new Car();


        ElectroCar tesla = new ElectroCar();
        tesla.makeSound();
        tesla.makeSound("Tesla bi-bi!");


    }

}
