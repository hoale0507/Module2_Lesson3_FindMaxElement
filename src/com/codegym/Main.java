package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element" + (i+1));
            array[i] = scanner.nextInt();
        }
        int maxElement = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if(maxElement < array[i]){
                maxElement = array[i];
                index = i+1;
            }
        }
        System.out.println("The max element is " + maxElement + " at index " + index);
    }
}
