package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //看看怎么push
        //看看这样的output行不行

        System.out.println("Without Huffman: " + Text.textLength()*8);
        Unsorted.placeUnsorted();
        Sorted.sort();


        String finalPath = "";
        for (int i = 0; i<Text.textLength();i++){
            finalPath = finalPath + findPath.findPath(Text.getText().substring(i,i+1));
        }
        System.out.println(finalPath);


        /*

                     (5)
              (3)            l(2)
         (2)     h(1)
      e(1) o(1)

        String messageBeingEncoded = "hello";
        String finalPath = "";
        for(int i = 0; i < messageBeingEncoded.size(); i++) {
            finalPath += findHuffmanPath(messageBeingEncoded.get(i));
        }

        public String findHuffmanPath(String letter) {

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
         }
         */

    }
}
