package com.company;

public class Charmeleon {
    private int hp;
    private String name;
    private double height;
    private Evolution evolution;
    private Element element;

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public Evolution getAttack() {
        return evolution;
    }

    public Element getElement() {
        return element;
    }

    public Charmeleon(int hp, String name, double height, Evolution evolution, Element element) {
        this.hp = hp;
        this.name = name;
        this.height = height;
        this.evolution = evolution;
        this.element = element;
    }

    public final String getInfo() {
        return "Hp: " + getHp() +
                "\nName: " + getName() +
                "\nHeight: " + getHeight()+
                "\nEvolution: " + getAttack() +
                "\nElement: " + getElement() ;
    }
}