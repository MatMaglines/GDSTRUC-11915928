package com.gdstruc.midterms;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args)
    {
        CardStack Deck = new CardStack();
        CardStack PlayerHeld = new CardStack();
        CardStack DiscardedCards = new CardStack();

        Deck.push(new Card(1,"I won't stray from this path"));
        Deck.push(new Card(2,"Past and Future"));
        Deck.push(new Card(3,"Towards the light"));
        Deck.push(new Card(4,"Everlasting Light"));
        Deck.push(new Card(5,"Fulfilling the Sworn Promise"));
        Deck.push(new Card(6,"Black Tea of Victory"));
        Deck.push(new Card(7,"Colors of a Clear Summer"));
        Deck.push(new Card(8,"Here With You"));
        Deck.push(new Card(9,"My Dreams Continue After I Wake Up"));
        Deck.push(new Card(10,"Unwavering Belief"));
        Deck.push(new Card(11,"A Bygone Time"));
        Deck.push(new Card(12,"Reliable Negotiator"));
        Deck.push(new Card(13,"I Made Friends"));
        Deck.push(new Card(14,"Past and Future"));
        Deck.push(new Card(15,"Recovery and Resolve"));
        Deck.push(new Card(16,"My Bible"));
        Deck.push(new Card(17,"Magical Halloween Theater"));
        Deck.push(new Card(18,"A Pleasant Imbalance"));
        Deck.push(new Card(19,"Walking an Entwined Path"));
        Deck.push(new Card(20,"Three of Us, Forward"));
        Deck.push(new Card(21,"Never-Ending Practice"));
        Deck.push(new Card(22,"Warm Christmas"));
        Deck.push(new Card(23,"Everyone Has Gathered"));
        Deck.push(new Card(24,"For This Fine Day"));
        Deck.push(new Card(25,"For My Treasured Ones"));
        Deck.push(new Card(26,"Deliver Your Wish"));
        Deck.push(new Card(27,"Reinforcements that Transcend Time"));
        Deck.push(new Card(28,"Stance on Art"));
        Deck.push(new Card(29,"Smile to Everyone"));
        Deck.push(new Card(30,"Welcome Back"));

        System.out.println("These are the cards in the Deck: \n");
        Deck.printStack();

        System.out.println("\nThere are 3 options and they will be chosen at random");
        System.out.println("\nThese 3 options are:\n");
        System.out.println("1. Draw -x- amount of cards (1 to 5)");
        System.out.println("2. Discard -x- amount of cards (1 to 5)");
        System.out.println("3. Get -x- amount of cards from the discarded pile (1 to 5)\n");

        while (Deck.size() != 0)
        {
            System.out.println("\nThere are currently " + Deck.size() + " cards in the deck.");
            System.out.println("There are currently " + DiscardedCards.size() + " discarded cards.");
            System.out.println("You are currently holding " + PlayerHeld.size() + " cards\n");
            System.out.println("These cards are:\n ");
            PlayerHeld.printStack();


            System.out.println("\nType anything to start the code: ");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            Random rand = new Random();
            int OptionChosen = rand.nextInt(4 - 1) + 1;;

            System.out.println("\nThe randomly chosen option is " + OptionChosen + "\n");

            Random rand1 = new Random();
            int Opt1Rand = rand.nextInt(6 - 1) + 1;

            if (OptionChosen == 1)
            {
                if (Opt1Rand > Deck.size())
                {
                    System.out.println("Cannot draw " + Opt1Rand + " cards because there are only " + Deck.size() + " cards left");
                    System.out.println("Changing value....");
                    Opt1Rand = Deck.size();

                }

                System.out.println(Opt1Rand + " Card/s will be drawn");
                int Starter1 = 0;

                while (Starter1 != Opt1Rand)
                {
                    PlayerHeld.push(Deck.pop());
                    Starter1++;
                }

            }

            else if(OptionChosen == 2)
            {

                if (Opt1Rand > Deck.size())
                {
                    System.out.println("Cannot discard " + Opt1Rand + " cards because there are only " + Deck.size() + " cards left");
                    System.out.println("Changing value....");
                    Opt1Rand = Deck.size();

                }

                System.out.println(Opt1Rand + " Cards will be discarded");
                int Starter2 = 0;

                while (Starter2 != Opt1Rand)
                {
                    DiscardedCards.push(Deck.pop());
                    Starter2++;
                }
            }

            else if(OptionChosen == 3)
            {

                if (DiscardedCards.isEmpty())
                {
                    System.out.println("There are no cards in the discarded pile...");
                }

                else if (Opt1Rand > DiscardedCards.size())
                {
                    System.out.println("Cannot get " + Opt1Rand + " cards because there are only " + DiscardedCards.size() + " cards in the discarded pile");
                    System.out.println("Changing value....");
                    Opt1Rand = DiscardedCards.size();
                    int Starter4 = Opt1Rand;
                    while (Starter4 != Opt1Rand) {

                        PlayerHeld.push(DiscardedCards.pop());
                        Starter4++;
                    }
                }

                else
                {
                    System.out.println(Opt1Rand + " Cards will be taken from the discarded pile");
                    int Starter3 = 0;

                    while (Starter3 != Opt1Rand)
                    {

                    PlayerHeld.push(DiscardedCards.pop());
                    Starter3++;

                    }
                }
            }

        }

        System.out.println("The Deck of cards is now empty");
    }
}

