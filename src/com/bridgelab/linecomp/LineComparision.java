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

		System.out.println("Enter p co-ordinate of first point: ");
		int p1 = sc.nextInt();
		System.out.println("Enter q co-ordinate of first point: ");
		int q1 = sc.nextInt();
		System.out.println("Enter p co-ordinate of second point: ");
		int p2 = sc.nextInt();
		System.out.println("Enter q co-ordinate of second point: ");
		int q2 = sc.nextInt();
		sc.close();
		
		double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double lengthOfLine2 = Math.sqrt(Math.pow((p2 - p1), 2) + Math.pow((q2 - q1), 2));
		System.out.println("Length of Line is : " + lengthOfLine1);
		System.out.println("Length of Line is : " + lengthOfLine2);
		
		Double line1=  Double.valueOf(lengthOfLine1);
		Double line2=  Double.valueOf(lengthOfLine2);
		
		int comp = line1.compareTo(line2);
		System.out.println("Length of Line is : " + comp);
		

	}

}
