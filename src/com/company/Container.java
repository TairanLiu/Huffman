package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class Container implements Comparable<Container> {
    String root = null;
    Container connectedLeft;
    Container connectedRight;
    Integer frequency;
    Integer level = 0;
    Container connectPrevious;

    public Container(String root, int frequency) {
        this.root = root;
        this.frequency = frequency;
    }

    /*public Container(int frequency, String cL, String cR){
        //this.root = root;
        connectedLeft = cL;
        connectedRight = cR;
        this.frequency = frequency;
    }*/
    public Container(int frequency, Container cL, Container cR) {
        //this.root = root;
        connectedLeft = cL;
        connectedRight = cR;
        this.frequency = frequency;
    }


    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public Container getConnectedLeft() {
        return connectedLeft;
    }

    public String getRoot() {
        return root;
    }

    public Container getConnectedRight() {
        return connectedRight;
    }

    public int getLevel() {
        return level;
    }

    public void increaseLevel() {
        level++;
    }

    public Container getConnectPrevious() {
        return connectPrevious;
    }

    public void setConnectPrevious(Container connectPrevious) {
        this.connectPrevious = connectPrevious;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public int compareTo(Container c) {
        if (frequency > c.frequency) {
            return c.frequency;
        } else return frequency;
    }

    /*
         [root (5)] -> updateAllNodeLevels so this would be the root container since it's the one calling
      [3]       [2:l]

     */

    public static void updateAllNodeLevels(Container container) {
        Container currentNode = container;
        //System.out.println("hello");
        if (container.getConnectPrevious() == null) {
            currentNode.setLevel(0);
        if (currentNode.getConnectedLeft() != null) {
            updateAllNodeLevels(currentNode.getConnectedLeft());
        }
        if (currentNode.getConnectedRight() != null) {
            updateAllNodeLevels(currentNode.getConnectedRight());
        }
        }
        if (container.getConnectPrevious() != null) {
            int previousLevel = currentNode.getConnectPrevious().getLevel();
            System.out.println("Currently at: " + currentNode.getFrequency());
            System.out.println("Previous Node Level: " + previousLevel);
            previousLevel++;
            currentNode.setLevel(previousLevel);
            if (currentNode.getConnectedLeft() != null) {
                updateAllNodeLevels(currentNode.getConnectedLeft());
            }
            if (currentNode.getConnectedRight() != null) {
                updateAllNodeLevels(currentNode.getConnectedRight());
            }
        }
    }
}


