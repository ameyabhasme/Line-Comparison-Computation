package com.bridgelabz.LineComparisonComputation;

import java.util.Scanner;

public class LineComparison {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Problem");
		System.out.println("Enter the value of co-ordinate");
		System.out.print("Enter the value of (x1,y1)= ");
		int x1 = SC.nextInt();
		int y1 = SC.nextInt();
		System.out.print("Enter the value of (x2,y2)= ");
		int x2 = SC.nextInt();
		int y2 = SC.nextInt();

		double lengthLine1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("Enter the values of next co-ordinates ");
		System.out.print("Enter the value of (x3,y3)= ");
		int x3 = SC.nextInt();
		int y3 = SC.nextInt();
		System.out.print("Enter the value of (x4,y4)= ");
		int x4 = SC.nextInt();
		int y4 = SC.nextInt();

		double lengthLine2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

		System.out.println("Length of Line 1 = " + lengthLine1);
		System.out.println("Length of Line2= " + lengthLine2);

		if (lengthLine1 == lengthLine2) {
		     System.out.println("Two Lines are Equal");
		} else {
		     System.out.println("Two Lines are Not Equal");
			if (lengthLine1 < lengthLine2) {
			     System.out.println("Line1 is less than Line2");
			} else {
			     System.out.println("Line2 is less than Line1");
			}
		}
	}
}