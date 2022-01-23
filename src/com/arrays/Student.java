package com.arrays;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int[] marks) {
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;

		for (int mark : marks) {
			sum += mark;
		}

		return sum;
	}

	public int getMaximumMark() {
		int maximum = Integer.MIN_VALUE;

		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}

		return maximum;
	}

	// Max mark with Collections class
	public int getMaxMark() {
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;

		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}

		return minimum;
	}

	// method 1: write out by hand
	public BigDecimal getAverageMarks() {
		int sum = 0;

		// sum of all values in array using for loop
		for (int mark : marks) {
			sum += mark;
		}

		BigDecimal average = new BigDecimal(sum / marks.size());
		return average;
	}

	// method 2: reuse code
	public BigDecimal getAverageMarks1() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		// return new BigDecimal(sum / number); //This returns an integer
		return new BigDecimal(sum).divide(new BigDecimal(number)); // This converts the integer and returns a decimal
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);

	}

}
