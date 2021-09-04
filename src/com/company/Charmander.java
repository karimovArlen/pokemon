package com.company;

public class Charmander extends Charmeleon {

    public Charmander(int hp, String name, double height, Evolution evolution, Element element) {
        super(hp, name, height, evolution, element);
        hp = 5;
    }

    public static void Ability(boolean boolaenDo) {
        if (boolaenDo == true) {
            System.out.println("FIREBALL");
        } else if (!(boolaenDo)) {
            System.out.println("CUT");
        }
    }

    public static final void Ability(boolean boolaenDo, int minutes) {
        if (boolaenDo == true) {
            System.out.println("Exists " + minutes + " minutes");
        } else {
            System.out.println("Leave");
        }
    }

    public static void Ability(int hp, boolean isHeFree) {
        if (hp < 50 && hp > 18) {
            if (isHeFree == true) {
                System.out.println("Will defend");
            } else if (isHeFree == false) {
                System.out.println("Dies");
            }
        }
        if(hp > 50 || hp < 18){
            System.out.println("Runs away");
        }
    }
}