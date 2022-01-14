package com.company;

import java.util.ArrayList;

public class Queue {
    static ArrayList<Container> printing = new ArrayList<>();
    static int temp = 0;
    static public void dequeue ( Container me){
        printing.add(me);
        //Sorted.sortTheLevels(me);
        Container.updateAllNodeLevels(me);
        // levels are set
        while (printing.size()>0) {
            Container tbr = printing.get(0);
            //
            if (tbr.getLevel() != temp){
                System.out.println();
                temp = tbr.getLevel();
            }
            //
            if (tbr.getRoot() == null){
                System.out.print(tbr.getFrequency() );
                System.out.print("level: "+ tbr.getLevel() +"/");
            }
            //
            printing.remove(0);
            if (tbr.getConnectedLeft() != null) {
                printing.add(tbr.getConnectedLeft());
            }
            if (tbr.getConnectedRight() != null) {
                printing.add(tbr.getConnectedRight());
            }else{
                System.out.print(tbr.root + ": "+tbr.frequency);
                System.out.print("level: "+ tbr.getLevel() +"/");
            }
        }
    }
}
