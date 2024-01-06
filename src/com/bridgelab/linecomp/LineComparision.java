package com.bridgelab.linecomp;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x co-ordinate of first point: ");
		int x1 = sc.nextInt();
		System.out.println("Enter y co-ordinate of first point: ");
		int y1 = sc.nextInt();
		System.out.println("Enter x co-ordinate of second point: ");
		int x2 = sc.nextInt();
		System.out.println("Enter y co-ordinate of second point: ");
		int y2 = sc.nextInt();
		sc.close();
		double lengthOfLine = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		System.out.println("Length of Line is : " + lengthOfLine);

	}

}
