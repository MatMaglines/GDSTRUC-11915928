package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

        Player Yachiyo = new Player (1,"Yachiyo",120);
        Player Sana = new Player(2,"Sana",80);
        Player Iroha = new Player(3,"Iroha",90);
        Player Felicia = new Player(4,"Felicia",100);
        Player Tsuruno = new Player(5,"Tsuruno",110);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addtofront(Yachiyo);
        playerLinkedList.addtofront(Sana);
        playerLinkedList.addtofront(Iroha);
        playerLinkedList.addtofront(Felicia);
        playerLinkedList.addtofront(Tsuruno);

        System.out.println("Before Removing First Node:");
        playerLinkedList.printList();

        System.out.print("\nThe Length of the Linked List is:\n");
        playerLinkedList.FindLength();


        System.out.print("\nAfter Removing First Node:\n");
        playerLinkedList.RemoveFirst();

        System.out.print("\nThe Length of the Linked List is:\n");
        playerLinkedList.FindLength();

        System.out.print("\nDoes the LinkedList contain Iroha?\n");
        System.out.println(playerLinkedList.contains(new Player(3,"Iroha",90)));
        System.out.print("\nAt what index is Iroha located?\n");
        System.out.println(playerLinkedList.indexOf(new Player(3,"Iroha",90)));

    }
}
