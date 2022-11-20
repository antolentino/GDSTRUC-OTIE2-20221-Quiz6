package com.gdstruc.module6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 89, -76, 24, 17, -4, 44, 101};

        System.out.println("INPUT NUMBER TO SEARCH: ");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        System.out.println(bunnySearch(numbers, userInput));
    }

    // bunny hop searching method
    public static int bunnySearch(int[] input, int value) {
        int start = 0;
        int end = input.length - 1;

        while (value != end || value != start) {
            // starts searching at the end of the array
            if (input[end] == value){
                return end;
            }
            // if the search value is not equal to the end element,
            // check the search value if it is equal to the initial element
            else if (input[start] == value){
                return start;
            }
            // returns -1 if the user input is not equal to any elements from the array
            else {
                return -1;
            }
        }
        return -1;
    }
}