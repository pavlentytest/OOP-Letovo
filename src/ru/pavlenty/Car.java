package ru.pavlenty;

public class Car {
    // Характеристики (свой-ва)
    // цвет, масса, марка, макс.скорость
    // ПОЛЯ КЛАССА (СВОЙСТВА КЛАССА)
    private String color;
    private int massa;
    private String brand;
    private double speed;

    public void setColor(String c) {
        // if(color.equals("red"))
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }

    // Действия
    // Издает звук - биби
    // Едет

    // Java Code Style

    public void makeSound() {
        System.out.println("Bi-bi!!!");
    }

    public void makeSound(String s) {
        System.out.println(s);
    }

    public void doMove() {

    }


}
