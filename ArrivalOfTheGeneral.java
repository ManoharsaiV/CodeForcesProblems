package com.problemset;


import java.util.Scanner;

public class ArrivalOfTheGeneral {




    private static int minSec(int[] arr) {
        int minIndex = 0, maxIndex = arr.length - 1;
        int index = 0;
        while (index < arr.length) {
            if (arr[index] <= arr[minIndex]) {
                minIndex = index;
            }
            index++;
        }

        index = arr.length - 1;
        while (index >= 0) {
            if (arr[index] >= arr[maxIndex]) {
                maxIndex = index;
            }
            index--;
        }
        // when the min and max meet, the min element is swapped with the max element
        // thereby one less place to travel for the max element. hence in that case, 
        // maxIndex -= 1
        if (maxIndex > minIndex) {
            maxIndex -= 1;
        }


        return arr.length - 1 - minIndex + maxIndex;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] line2 = scanner.nextLine().split(" ");
        int[] soldiers = new int[length];
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = Integer.parseInt(line2[i]);
        }
        System.out.println(minSec(soldiers));
        scanner.close();
    }
}



