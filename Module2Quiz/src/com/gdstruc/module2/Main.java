package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

        Player Homura = new Player (1,"Homura",120);
        Player Madoka = new Player(2,"Madoka",80);
        Player Sayaka = new Player(3,"Sayaka",90);
        Player Mami = new Player(4,"Mami,",100);
        Player Kyoko = new Player(5,"Kyoko",110);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addtofront(Homura);
        playerLinkedList.addtofront(Madoka);
        playerLinkedList.addtofront(Sayaka);
        playerLinkedList.addtofront(Mami);
        playerLinkedList.addtofront(Kyoko);

        playerLinkedList.printList();
    }
}
