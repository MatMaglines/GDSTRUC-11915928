package com.gdstruc.module7;

public class Tree
{
    private Node root;

    public void insert(int value)
    {
        if (root == null)
        {
            root = new Node (value);
        }

        else
        {
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
    }

    public void traverseDescendingOrder()
    {
        if (root != null)
        {
            root.traverseDescendingOrder();
        }
    }

    public void GetMax()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    public Node GetMaxiumum()
    {
        root.GetMaximum();

        return null;
    }



}
