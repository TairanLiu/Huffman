package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //看看怎么push
        //看看这样的output行不行

        System.out.println("Without Huffman: " + Text.textLength()*8);
        Unsorted.placeUnsorted();
        Sorted.sort();
    }
}
