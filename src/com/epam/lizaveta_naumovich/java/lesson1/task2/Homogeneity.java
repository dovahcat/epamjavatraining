package com.epam.lizaveta_naumovich.java.lesson1.task2;

public class Homogeneity {
    public String text;
    public String words[];
    public char letters[];
    public boolean repeat;

    public static void main(String[] args) {
        Homogeneity app = new Homogeneity();
        app.runApplication();
    }

    public void runApplication() {
        formString();
        printString();
        splitAndCompare();
    }

    public void formString() {
        text = "olelrlalsld aaaa tyrui";
    }

    public void printString() {
        System.out.println(text);
    }

    public void splitAndCompare() {
        words = text.split(" ");
        for (String word : words) {
            letters = word.toCharArray();
            compareLetters();
            System.out.print("--- ");
        }
    }

    public void compareLetters() {
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            for(int j = i + 1; j < letters.length; j++) {
                if (letters[i] == letters[j]) {
                    System.out.print(letters[i]);
                    repeat = true;
                    break;
                }
                else { repeat = false; }
            }
        }
    }


}
