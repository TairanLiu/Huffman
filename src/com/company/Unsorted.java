package com.company;

import java.util.HashMap;

public class Unsorted {
    static String copyText = Text.getText();
    static HashMap<String, Integer> unsorted = new HashMap<>();
    public static void placeUnsorted (){
        for (int i = 0; i<copyText.length();i++){
            if (unsorted.containsKey(copyText.substring(i,i+1))){
                String newKey = copyText.substring(i,i+1);
                unsorted.put(newKey, unsorted.get(newKey)+1);
            }else{
                String newKey = copyText.substring(i,i+1);
                unsorted.put(newKey, 1);
            }
        }
        System.out.println(unsorted);
    }
}
