package com.epam.lizaveta_naumovich.java.lesson1.task2;

public class Homogeneity {
    public String text;
    public String wordsExt[];
    public char lettersExt[];

    public static void main(String[] args) {
        Homogeneity app = new Homogeneity();
        app.runApplication();
    }

    public void runApplication() {
        formString();
        printString();
        splitString();
    }

    public void formString() {
        text = "aab abb abc aaa bca cab ccc";
    }

    public void printString() {
        System.out.println(text);
    }

    public void splitString() {
        String words[] = text.split(" ");
        wordsExt = words;
        for (String word1 : words) {
            char letters[] = word1.toCharArray();
            lettersExt = letters;
        }


    }



}
