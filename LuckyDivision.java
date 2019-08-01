package com.problemset;

import java.util.Scanner;

public class LuckyDivision {

	public static boolean checkIfAlmostLucky(int number) {
		

		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		if (checkIfAlmostLucky(number)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scan.close();

	}

}
