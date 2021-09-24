package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("What number Would you like to choose?");
        Scanner input = new Scanner(System.in);
        int initialNum = input.nextInt();
        int numOfTimes = (initialNum)-1;
        int currentNum = 0;

        for (int i=0;i<numOfTimes;i++) {
            currentNum = currentNum + 1;
            System.out.println(currentNum);
        }

        for (int i=0;i<numOfTimes+1;i++) {
            currentNum = currentNum - 1;
            System.out.println(currentNum);
        }



    }
}
