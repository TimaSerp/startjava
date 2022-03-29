package com.startjava.lesson_2_3.animal;

public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("мужчина");
        wolfOne.setName("Вася");
        wolfOne.setWeight(25);
        wolfOne.setAge(7);
        wolfOne.setColour("серый");
        System.out.println("Волк " + wolfOne.getSex());
        System.out.println("Волка зовут " + wolfOne.getName());
        System.out.println("Ему " + wolfOne.getAge() + " лет");
        System.out.println("Он весит " + wolfOne.getWeight() + " кг");
        System.out.println(wolfOne.getName() + " " + wolfOne.getColour() + " цвета");
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}