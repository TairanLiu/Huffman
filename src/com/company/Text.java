package com.company;

public class Text {
   // static String text = "hello imma text";
    static String text = "hello";
    static int textLength (){
        return text.length();
    }

    public static void setText(String text) {
        Text.text = text;
    }

    public static String getText() {
        return text;
    }
}
