package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Container implements Comparable<Container> {
    String root;
    Container connectedLeft;
    Container connectedRight;
    int frequency;
    int level = 0;
    Container connectPrevious;
    public Container(String root, int frequency){
        this.root = root;
        this.frequency = frequency;
    }
    /*public Container(int frequency, String cL, String cR){
        //this.root = root;
        connectedLeft = cL;
        connectedRight = cR;
        this.frequency = frequency;
    }*/
    public Container(int frequency, Container cL, Container cR){
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
    public int compareTo (Container c){
        if (frequency > c.frequency){
            return c.frequency;
        }
        else return frequency;
    }
}
