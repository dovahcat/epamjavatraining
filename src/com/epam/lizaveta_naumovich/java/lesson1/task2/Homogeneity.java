package com.epam.lizaveta_naumovich.java.lesson1.task2;

public class Homogeneity {
    public String text;
    public String words[];
    public char letters[];

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
        text = "aab abb abc aaa bca cab ccc";
    }

    public void printString() {
        System.out.println(text);
    }

    public void splitAndCompare() {
        words = text.split(" ");
        for (String word : words) {
            letters = word.toCharArray();
            compareLetters(0, letters.length);
        }
    }

    public void compareLetters(int i, int j) {
        for(j = i + 1; j < letters.length; j++) {
            if (letters[i] == letters[j]) {
                System.out.print(letters[i]);
                break;
            }
        }
    }


}
