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



/**
 *  private static int minimumTimeRequired(int[] soldiers) {
 *             int count_1 = 0, count_2 = 0;
 *             int[] soldiers1 = new int[soldiers.length];
 *             for (int i = 0; i < soldiers1.length; i++) {
 *                 soldiers1[i] = soldiers[i];
 *             }
 *             int[] soldiers2 = new int[soldiers.length];
 *             for (int i = 0; i < soldiers2.length; i++) {
 *                 soldiers2[i] = soldiers[i];
 *             }
 *             for (int i = 0; i < soldiers1.length; i++) {
 *                 for (int j = 0; j < soldiers1.length; j++) {
 *                     if (soldiers1[i] < soldiers1[j]) {
 *                         soldiers1[i] = soldiers1[0] ^ soldiers1[i];
 *                         soldiers1[i] = soldiers1[0] ^ soldiers1[i];
 *                         soldiers1[0] = soldiers1[0] ^ soldiers1[i];
 *                         count_1++;
 *                     }
 *                 }
 *
 *             }
 *             for (int i = soldiers2.length - 1; i > 0; i--) {
 *                 if (soldiers2[soldiers2.length - 1] > soldiers2[i]) {
 *                     soldiers2[soldiers2.length - 1] = soldiers2[soldiers2.length - 1] ^ soldiers2[i];
 *                     soldiers2[i] = soldiers2[soldiers2.length - 1] ^ soldiers2[i];
 *                     soldiers2[soldiers2.length - 1] = soldiers2[soldiers2.length - 1] ^ soldiers2[i];
 *                     count_2++;
 *                 }
 *             }
 *
 *             return count_1 + count_2;
 *         }
 *  */