package com.gdstruc.module5;

public class Main {

    public static void main(String[] args)
    {


	    Player EyyothePizzaHere = new Player(132, "EyyoThePizzaHere", 205);
        Player HeLagginBro = new Player(43, "HeLagginBro", 146);
        Player RGBBYYOASOBI = new Player(88, "RGB.By.YOASOBI", 123);
        Player AlbedoReRun = new Player(27,"AlbedoReRun",9);
        Player VineThudSoundEffect = new Player(99,"VineThudSoundEffect", 84);

        SimpleHashTable hashtable = new SimpleHashTable();

        hashtable.put(EyyothePizzaHere.getUsername(), EyyothePizzaHere);
        hashtable.put(HeLagginBro.getUsername(), HeLagginBro);
        hashtable.put(RGBBYYOASOBI.getUsername(), RGBBYYOASOBI);
        hashtable.put(AlbedoReRun.getUsername(), AlbedoReRun);
        hashtable.put(VineThudSoundEffect.getUsername(), VineThudSoundEffect);

        System.out.println("The current hash table has these elements: \n");
        hashtable.printHashtable();

        System.out.println("\nThe removed element will be: ");
        System.out.println(hashtable.get("RGB.By.YOASOBI") + "\n");

        hashtable.remove("RGB.By.YOASOBI");

        System.out.println("The hash table is now: ");
        hashtable.printHashtable();



    }
}
