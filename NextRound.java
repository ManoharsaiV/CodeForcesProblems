package com.problemset;

import java.util.Scanner;

public class NextRound {

	public static int nextRoundContestant(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < k; i++) {
			if(k < arr.length) {
				if(arr[k] > 0) {
					if(arr[i] >= arr[k]) {
						count++;
					}else {
						continue;
					}
				}else {
					break;
				}
			}else if(k == arr.length) {
				if(arr[arr.length - 1] > 0) {
					if(arr[i] >= arr[arr.length-1]) {
						count++;
					}else {
						continue;
					}	
				}else {
					break;
				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] inputLine1 = scan.nextLine().split(" ");
		int n = Integer.parseInt(inputLine1[0]);
		int k = Integer.parseInt(inputLine1[1]);
		String[] inputLine2 = scan.nextLine().split(" ");
		int[] arr = new int[n];
		int index = 0;
		for (String s : inputLine2) {
			arr[index++] = Integer.parseInt(s);
			
		}
		System.out.println(nextRoundContestant(arr, k));
		scan.close();

	}

}
