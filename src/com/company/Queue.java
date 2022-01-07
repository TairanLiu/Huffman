package com.company;

import java.util.ArrayList;

public class Queue {
    static ArrayList<Container> printing = new ArrayList<>();
    static int temp = 0;
    static public void dequeue ( Container me){
        printing.add(me);
        while (printing.size()>0) {
            Container tbr = printing.get(0);
            //System.out.println("temp:" + temp);
            if (tbr.getLevel()!=temp){
                //System.out.print("level: "+ tbr.getLevel()+ "/");
                System.out.println(tbr.getFrequency());
                temp++;
                //System.out.println("temp:" + temp);
            }else {
                System.out.print(tbr.getFrequency());
            }
            printing.remove(0);
            if (tbr.getConnectedLeft() != null) {
                printing.add(tbr.getConnectedLeft());
            }
            if (tbr.getConnectedRight() != null) {
                printing.add(tbr.getConnectedRight());
            }else{
                System.out.print(tbr.root + ": "+tbr.frequency);
            }
        }
    }
}
