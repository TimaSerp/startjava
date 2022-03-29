package com.startjava.lesson_2_3.robot;

import java.util.Scanner;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyAvenger = new Jaeger();
        Jaeger gipsyDanger = new Jaeger();
        Scanner console = new Scanner(System.in);
        gipsyAvenger.setModelName("Gipsy Avenger");
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyAvenger.setMark("Mark-6");
        gipsyDanger.setMark("Mark-3");
        gipsyAvenger.setOrigin("Unknown");
        gipsyDanger.setOrigin("USA");
        gipsyAvenger.setFightStyle("Street Fighter");
        gipsyDanger.setFightStyle("Street Fighter");
        gipsyAvenger.setHeight(81.77);
        gipsyDanger.setHeight(79.25);
        gipsyAvenger.setWeight(2004);
        gipsyDanger.setWeight(1980);
        System.out.println(gipsyAvenger.getModelName());
        System.out.println("Mark: " + gipsyAvenger.getMark());
        System.out.println("Origin: " + gipsyAvenger.getOrigin());
        System.out.println("Fight style: " + gipsyAvenger.getFightStyle());
        System.out.println("Height: " + gipsyAvenger.getHeight());
        System.out.println("Weight: " + gipsyAvenger.getWeight());
        System.out.println();
        System.out.println(gipsyDanger.getModelName());
        System.out.println("Mark: " + gipsyDanger.getMark());
        System.out.println("Origin: " + gipsyDanger.getOrigin());
        System.out.println("Fight style: " + gipsyDanger.getFightStyle());
        System.out.println("Height: " + gipsyDanger.getHeight());
        System.out.println("Weight: " + gipsyDanger.getWeight());

        System.out.println("drift [on/off]");
        String choice = console.nextLine();
        if (choice.equals("on")) {
            System.out.println("drift " + gipsyAvenger.drift());
        } else {
            System.out.println("drift " + !gipsyAvenger.drift());
        }
        System.out.println("What should I do? [move, scan Kaiju, use Plasma Caster]");
        choice = console.nextLine();
        String status = "neutral";
        switch (choice) {
            case "move":
                status = gipsyAvenger.move();
                break;
            case "scanKaiju":
                status = gipsyAvenger.scanKaiju();
                break;
            case "usePlasmaCaster":
                status = gipsyAvenger.usePlasmaCaster();
                break;
            default:
                System.out.println("Illegal status");
                break;
        }
        System.out.println("Status: " + status);
    }
}