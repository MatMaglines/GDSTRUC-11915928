package com.gdstruc.midterms;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class CardStack {
    private LinkedList<Card> stack;

    public CardStack() {
        stack = new LinkedList<Card>();

    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }
    public int size()
    {
        return stack.size();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
