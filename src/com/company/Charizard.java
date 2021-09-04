package com.company;

public class Charizard extends Charmander {
    public Charizard(int hp, String name, double height, Evolution evolution, Element element) {
        super(hp, name, height, evolution, element);
    }

    public static void Ability(int hp, boolean isHeFree) {
        if (hp < 50 && hp > 18) {
            if (isHeFree == true) {
                System.out.println("End");
            } else if (isHeFree == false) {
                System.out.println("End");
            }
        }
        if(hp > 50 || hp < 18){
            System.out.println("End");
        }
    }
}
