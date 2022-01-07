package com.company;

import java.util.Iterator;
import java.util.Map;

public class Sorted {
   //  Unsorted.unsorted
    public static void sort(){
        placeSortedLetters();
        sortTheRest();
        printEverything();
    }
    public static void placeSortedLetters(){
        Iterator throughUnsorted = Unsorted.unsorted.entrySet().iterator();
        while (throughUnsorted.hasNext()){
            Map.Entry letter = (Map.Entry) throughUnsorted.next();
            Container lett = new Container((String) letter.getKey(),(int)letter.getValue());
            PriorityQueue.addToQueue(lett);
        }
    }
    public static void sortTheRest(){
        Container left;
        Container right;
        while (PriorityQueue.priorityQueue.size()>1){
            left = PriorityQueue.priorityQueue.poll();
            right = PriorityQueue.priorityQueue.poll();
            Container newContainer = new Container(left.frequency+ right.frequency, left,right);
            left.setConnectPrevious(newContainer);
            newContainer.increaseLevel();
            right.setConnectPrevious(newContainer);
            PriorityQueue.addToQueue(newContainer);
        }
    }
    //IDN if toString can work like this.
    public static void printEverything(){
        Container answer = PriorityQueue.priorityQueue.poll();
        Queue.dequeue(answer);
        //System.out.println(answer.getClass());
    }
}
