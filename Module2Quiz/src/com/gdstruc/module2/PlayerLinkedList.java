package com.gdstruc.module2;

public class PlayerLinkedList {
    private static boolean contains;
    private PlayerNode head;

    public void addtofront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.println(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();


        }
        System.out.println("null");
    }


    public void RemoveFirst() {
        if (head != null) {
            head = head.getNextPlayer();
        }

        PlayerNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.println(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();


        }
        System.out.println("null");
    }

    public int FindLength()
    {
        PlayerNode temp  = head;
        int count = 0;
        while (temp != null)
        {
            temp = temp.getNextPlayer();
            count++;
        }
        System.out.println(count);
        return count;
    }

}





