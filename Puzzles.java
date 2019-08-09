package com.problemset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Puzzles {
    private static int leastPossibleDifferenceBetweenThePuzzlePieces(int[] puzzlePieces, int n){
        Arrays.sort(puzzlePieces);
        List<Integer> li = new ArrayList<>();
        Arrays.asList(li);
        int i = 0, j = li.size();
        while(i < j){
            if(li.subList(i,j).size() == n){
            }
        }




        return 0;
    }









    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line1 = scan.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);
        String[] line2 = scan.nextLine().split(" ");
        int[] puzzlePieces = new int[m];
        for (int i = 0; i < puzzlePieces.length; i++) {
            puzzlePieces[i] = Integer.parseInt(line2[i]);
        }
        System.out.println(leastPossibleDifferenceBetweenThePuzzlePieces(puzzlePieces,n));
        scan.close();


    }
}
