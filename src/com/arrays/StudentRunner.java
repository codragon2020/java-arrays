package com.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 100, 98, 70, 98, 100 };
		Student student = new Student("Jason", marks);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("max of marks " + maximumMark);

		int maxMark = student.getMaxMark();
		System.out.println("max marks " + maxMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("min of marks " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("avg of marks " + average);

		BigDecimal average1 = student.getAverageMarks1();
		System.out.println("avg of marks " + average1);

		System.out.println(student);


		student.addNewMark(35);
		System.out.println(student);

		student.removeMarkAtIndex(5);
		System.out.println(student);
	}

}
