package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Player> playerList = new ArrayList<>();

    playerList.add(new Player(1,"Homrua",120));
    playerList.add(new Player(2,"Madoka",80));
    playerList.add(new Player(3,"Mami",100));
    playerList.add(new Player(4,"Kyoko",110));
    playerList.add(new Player(5,"Sayaka,",90));


    for (Player p : playerList)
    {
        System.out.println(p);
    }
    }
}
