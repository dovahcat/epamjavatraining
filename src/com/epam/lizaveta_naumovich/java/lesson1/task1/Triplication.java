package com.epam.lizaveta_naumovich.java.lesson1.task1;

public class Triplication {
    public int array[] = new int[20];

    public static void main(String[] args) {
        Triplication app = new Triplication();
        app.runApplication();
    }

    public void runApplication() {
        generateElements();
        printArray();
        System.out.println("==== end or array ====");
        findElement();
        System.out.println("==== new array ====");
        printArray();
    }

    public void generateElements() {
        for(int index = 0; index < array.length; index++) {
            //((max - min) + 1) + min
            array[index] = (int) (Math.random()*21 - 10);
        }
    }

    public void printArray() {
        for(int index = 0; index < array.length; index++) {
            System.out.println("Element #" + index + " = " + array[index]);
        }
    }

    public void findElement() {
        float sign;
        float signNext;
        for (int index = 0; index < array.length; index++) {
            sign = Math.signum(array[index]);
            //find all positive elements
            if (sign == 1.0) {
                try {
                    int indexNext = index + 1;
                    signNext = Math.signum(array[indexNext]);
                    //check if the next element is negative
                    if (signNext == -1.0) {
                        System.out.println("Element #" + index + " should be triplied.");
                        array[index] = array[index] * 3;
                    }
                }
                //a positive element could be the last one in array
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("There are no elements after #" + index);
                }
            }
        }
    }
}
