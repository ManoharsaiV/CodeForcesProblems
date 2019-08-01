package com.problemset;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tram {
	static List<Integer> li = new ArrayList<>();

	public static void tramCapacity(int[] a) {

		int out = a[0], in = a[1];
		int passengersInTram = 0;
		if (out == 0) {
			passengersInTram += in;
		} else {
			passengersInTram = passengersInTram + in - out;
		}

		li.add(passengersInTram);

	}
	

	public static int justToSort(List<Integer> l) {
		int temp = l.get(0);
		for (int i = 0; i < l.size(); i++) {
			if (temp < l.get(i)) {
				temp = l.get(i);
			} else {
				continue;
			}
		}

		return temp;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int stops = Integer.parseInt(scan.nextLine());

		while (stops > 0) {
			String[] totalPassangers = scan.nextLine().split(" ");
			int index = 0;
			int[] a = new int[totalPassangers.length];
			while (index < a.length) {
				a[index] = Integer.parseInt(totalPassangers[index]);
				index++;
			}
			

			stops--;
		}

		scan.close();

	}

}
