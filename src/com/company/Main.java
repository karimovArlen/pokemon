package com.company;

import java.util.Random;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {
        Charmander charmander = new Charmander(random.nextInt(150) + 1, "Charmander", 130, Evolution.RARE, Element.DRAGON);
        Charizard charizard = new Charizard(random.nextInt(250) + 1, "Charizard", random.nextInt(200) + 1, Evolution.MYTHIVAL, Element.AIR);

        Charmeleon charmeleon = new Charmeleon(random.nextInt(200) + 1,"Charmeleon", random.nextInt(180)+1, Evolution.RARE,Element.FIRE );



        System.out.println("__________________");

        System.out.println(charmander.getInfo());
        Charmander.Ability(random.nextBoolean());
        Charmander.Ability(random.nextBoolean(), random.nextInt(120) + 1);
        Charmander.Ability(random.nextInt(100) + 1, random.nextBoolean());

        System.out.println("__________________");

        System.out.println(charizard.getInfo());
        Charizard.Ability(random.nextBoolean());
        Charizard.Ability(random.nextBoolean(), random.nextInt(120) + 1);
        Charizard.Ability(random.nextInt(100) + 1, random.nextBoolean());

        System.out.println("__________________");

        System.out.println(charmeleon.getInfo());
        Charizard.Ability(random.nextBoolean());
        Charizard.Ability(random.nextBoolean(), random.nextInt(120) + 1);
        Charizard.Ability(random.nextInt(100) + 1, random.nextBoolean());

        System.out.println("__________________");

    }
}