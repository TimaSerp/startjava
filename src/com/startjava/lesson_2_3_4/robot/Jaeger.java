package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private String fightStyle;
    private double height;
    private double weight;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFightStyle() {
        return fightStyle;
    }

    public void setFightStyle(String fightStyle) {
        this.fightStyle = fightStyle;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    boolean drift() {
        return true;
    }

    String move() {
        return "move";
    }

    String scanKaiju() {
        return "scanning";
    }

    String usePlasmaCaster() {
        return "shooting";
    }
}