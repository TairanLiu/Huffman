package com.company;

import java.util.HashMap;

public class findPath {
    public static HashMap<String, Container> findHuffmanPath = new HashMap<String, Container>();

    public static Integer searchInHuff (String a){
        return findHuffmanPath.get(a).getFrequency();
    }

    public static String findPath(String letter){
        Container currentContainer = findHuffmanPath.get(letter);
        // potential null
        //Container cameFrom = currentContainer.getConnectPrevious();
        String pathWay = "";
        while (currentContainer.getConnectPrevious()!=null) {
            if (currentContainer == currentContainer.getConnectPrevious().getConnectedLeft()) {
                pathWay += "0";
            } else if (currentContainer == currentContainer.getConnectPrevious().getConnectedRight()) {
                pathWay += "1";
            }
            currentContainer = currentContainer.getConnectPrevious();
        }
        return pathWay;
    }
    /*public String findHuffmanPath(String letter) {

        Container currentContainer = hm.get("letter");
        Container cameFrom = currentContainer;
        String pathWay = "";
        currentContainer = currentContainer.getPrevious();
        while(current.getPrev != null) {

          if(currentContainer.getLeft.equals("o")
              pathway += "0";
          else if(currentContainer.getRight.equals("o")
             pathway += "1";
        cameFrom = currentContainer;
        currentContainer = currentContainer.getPrevious();

        }
    }*/

}
