package com.gdstruc.module3;

import java.util.Scanner;
import java.util.Random;
import java.util.random.RandomGenerator;


public class Main {

    public static void main(String[] args) {



        LinkedStack stack = new LinkedStack();

        stack.push(new Player(1,"Homura",43));
        stack.push(new Player(2,"Madoka",120));
        stack.push(new Player(3,"Kyoko",84));
        stack.push(new Player(4,"Mami",234));
        stack.push(new Player(5,"Felicia",69));
        stack.push(new Player(6,"Tsuruno",57));
        stack.push(new Player(7,"Yachiyo",123));
        stack.push(new Player(8,"Iroha",43));
        stack.push(new Player(9,"Momoko",120));
        stack.push(new Player(10,"Kaede",84));
        stack.push(new Player(11,"Rena",234));
        stack.push(new Player(12,"Mitama",69));
        stack.push(new Player(13,"Kanagi",57));
        stack.push(new Player(14,"Ui",123));
        stack.push(new Player(15,"Sana",43));
        stack.push(new Player(16,"Karin",120));
        stack.push(new Player(17,"Yuna",84));
        stack.push(new Player(18,"Hikaru",234));
        stack.push(new Player(19,"Ao",69));
        stack.push(new Player(20,"Juri",57));
        stack.push(new Player(21,"Shizuka",123));
        stack.push(new Player(22,"Chiharu",43));
        stack.push(new Player(23,"Sunao",120));
        stack.push(new Player(24,"Himena",84));
        stack.push(new Player(25,"Shigure",234));
        stack.push(new Player(26,"Hagumu",69));
        stack.push(new Player(27,"Alexandra",57));
        stack.push(new Player(28,"Nayuta",123));

        stack.push(new Player(29,"Mikage",43));
        stack.push(new Player(30,"Sudachi",120));
        stack.push(new Player(31,"Yozuru",84));
        stack.push(new Player(32,"Livia",234));
        stack.push(new Player(33,"Asuka",69));
        stack.push(new Player(34,"Kanoko",57));
        stack.push(new Player(35,"Natsuki",123));
        stack.push(new Player(36,"Hinano",43));
        stack.push(new Player(37,"Sasara",120));
        stack.push(new Player(38,"Nanaka",84));
        stack.push(new Player(39,"Emiri",234));
        stack.push(new Player(40,"Shizuku",69));
        stack.push(new Player(41,"Akira",57));
        stack.push(new Player(42,"Manaka",123));
        stack.push(new Player(43,"Ria",43));
        stack.push(new Player(44,"Kako",120));
        stack.push(new Player(45,"Meiyoi",84));
        stack.push(new Player(46,"Leila",234));
        stack.push(new Player(47,"Seika",69));
        stack.push(new Player(48,"Mito",57));
        stack.push(new Player(49,"Kokoro",123));
        stack.push(new Player(50,"Yukika",43));



        System.out.println("Time to play Valorant");
        System.out.println("Starting up the queue.....\n");


        int i = 0;
        while (i < 10)
        {
            Random rand = new Random();
            int random_integer = rand.nextInt(8 - 0) + 0;

            if (random_integer >= 5)
            {
                int k = 0;
                System.out.println("5 players in this queue:\n");

                while (k < 5)
                {
                    System.out.println("This player joined the queue: " + stack.pop());
                    k++;

                }
                System.out.println("\nThe game will now start...\n");
                i++;
            }

            else
            {
                System.out.println("\nOnly " + random_integer + " player/s queued up");
                System.out.println("The game will now return to the queue\n");
            }

        }


    }


}
