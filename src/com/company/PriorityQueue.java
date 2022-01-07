package com.company;

public class PriorityQueue {
    public static java.util.PriorityQueue<Container> priorityQueue = new java.util.PriorityQueue<>();
    public static void addToQueue(Container letter){
        priorityQueue.add(letter);
    }

    public static java.util.PriorityQueue<Container> getCalc() {
        return priorityQueue;
    }
}
