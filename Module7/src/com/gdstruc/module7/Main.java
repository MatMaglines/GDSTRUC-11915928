package com.gdstruc.module7;

public class Main
{

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(22);
        tree.insert(34);
        tree.insert(123);
        tree.insert(213);
        tree.insert(11);
        tree.insert(54);
        tree.insert(3);
        tree.insert(98);

        //tree.traverseInOrder();
        //System.out.println(tree.get(3));

        System.out.println("The Tree in Descending Order: ");
        tree.traverseDescendingOrder();
        System.out.println("\n");

        System.out.println("The Tree in Normal Order: ");
        tree.traverseInOrder();
        System.out.println("\nThe Maximum element in the tree is: ");
        tree.GetMaxiumum();

    }


}
