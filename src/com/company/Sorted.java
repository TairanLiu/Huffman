package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Sorted {
    public static PriorityQueue sortedFrequencyTable = new PriorityQueue();

    public static void sort(){
        placeSortedLetters();
        sortTheRest();
        printEverything();
    }
    public static void placeSortedLetters(){
        Iterator throughUnsorted = Unsorted.unsorted.entrySet().iterator();
        while (throughUnsorted.hasNext()){
            Map.Entry letter = (Map.Entry) throughUnsorted.next();
            Container lett = new Container((String) letter.getKey(),(Integer)letter.getValue());
            PriorityQueue.addToQueue(lett);
            findPath.findHuffmanPath.put(lett.getRoot(),lett);
            //sortTheLevels();
        }

    }

    /*public static void placeSortedLetters2(){
        Iterator throughUnsorted = Unsorted.unsorted.entrySet().iterator();
        while (throughUnsorted.hasNext()){
            Map.Entry letter = (Map.Entry) throughUnsorted.next();
            Container lett = new Container((String) letter.getKey(),(int)letter.getValue());
        }

    }*/
    private static int level = 0;
    public static void sortTheLevels(Container r){
        if (r.getConnectedLeft() != null || r.getConnectedRight() != null){
            r.setLevel(level);

            level++;
            System.out.println(level);
            sortTheLevels(r.getConnectedLeft());
            System.out.println("left processed" + r.getConnectedLeft().getLevel());
            sortTheLevels(r.getConnectedRight());
            System.out.println("right processed" + r.getConnectedRight().getLevel());
        }
    }
    /*public static Container pointer;
    public static void sortTheLevels( Container r){
        pointer = r;
        while (r.getConnectedLeft() != null || r.getConnectedRight() != null){

        }
    }*/

    public static void sortTheRest(){
        Container left;
        Container right;
        Container temp;
        while (PriorityQueue.priorityQueue.size()>1){
            left = PriorityQueue.priorityQueue.poll();
            right = PriorityQueue.priorityQueue.poll();
            Container newContainer = new Container(left.frequency+ right.frequency, left,right);
            left.setConnectPrevious(newContainer);
            left.setLevel(newContainer.getLevel()+1);
            temp = left;
            /*while(temp.getConnectedLeft()!=null){
                temp = temp.connectedLeft;
                temp.increaseLevel();
            }
            temp = left;
            while(temp.getConnectedRight()!=null){
                temp = temp.connectedRight;
                temp.increaseLevel();
            }
            temp = right;
            while(temp.getConnectedLeft()!=null){
                temp = temp.connectedLeft;
                temp.increaseLevel();
            }
            temp = right;
            while(temp.getConnectedRight()!=null){
                temp = temp.connectedRight;
                temp.increaseLevel();
            }*/
            //toBeAdded(newContainer);
            right.setConnectPrevious(newContainer);
            //right.setLevel(newContainer.getLevel()+1);
            PriorityQueue.addToQueue(newContainer);
        }
    }
    public static void toBeAdded(Container a){
        ArrayList<Container> toReturn = new ArrayList<Container>();
        Container pointer = a;
        while (pointer.getConnectedLeft() != null){
            System.out.print(toReturn);
            toReturn.add(pointer.getConnectedLeft());
            toReturn.add(pointer.getConnectedRight());
            pointer = toReturn.get(0);
            pointer.increaseLevel();
            toReturn.remove(0);
        }
        /*while (toReturn.size()>0){
            System.out.println("check");
            toReturn.get(0).increaseLevel();

        }*/
    }
    //IDN if toString can work like this.
    public static void printEverything(){
        Container answer = PriorityQueue.priorityQueue.poll();
       // Container.updateAllNodeLevels(answer);
        Queue.dequeue(answer);
        //System.out.println(answer.getClass());
    }

}
