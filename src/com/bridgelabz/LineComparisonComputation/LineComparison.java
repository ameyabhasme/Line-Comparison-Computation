package com.bridgelabz.LineComparisonComputation;

public class LineComparison {
	int x1, x2, y1, y2;

	public LineComparison(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public double lengthOfLine() {
		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return length;
	}

	public static void diffOfLine(double length1, double length2) {
		if (length1 == length2) {
			System.out.println("Two Lines are Equal");
		} else {
			System.out.println("Two Lines are Not Equal");
			if (length1 < length2) {
				System.out.println("Line1 is less than Line2");
			} else {
				System.out.println("Line2 is less than Line1");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Problem");

		LineComparison line1 = new LineComparison(2, 4, 9, 8);

		Double lengthLine1 = line1.lengthOfLine();
		System.out.println("Length of Line 1 = " + lengthLine1);

		LineComparison line2 = new LineComparison(4, 5, 7, 9);

		Double lengthLine2 = line2.lengthOfLine();
		System.out.println("Length of Line 2 = " + lengthLine2);

		diffOfLine(lengthLine1, lengthLine2);
		System.out.println(lengthLine1.equals(lengthLine2));
		System.out.println(lengthLine1.compareTo(lengthLine2));
	}
}