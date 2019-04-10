package com.array;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {

	 private static void printMissingNumber(int[] numbers, int count) {
	        int missingCount = count - numbers.length;
	        BitSet bitSet = new BitSet(count);
	 
	        for (int number : numbers) {
	            bitSet.set(number - 1);
	        }
	 
	        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
	        Arrays.toString(numbers), count);
	        int lastMissingIndex = 0;

	        for (int i = 0; i < missingCount; i++) {
	            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
	            System.out.println(++lastMissingIndex);
	        }
	    }
	 
	 private static int getMissingNumber(int[] numbers, int totalCount) {
	        int expectedSum = totalCount * ((totalCount + 1) / 2);
	        int actualSum = 0;
	        for (int i : numbers) {
	            actualSum += i;
	        }
	 
	        return expectedSum - actualSum;
	    }
	 
	 public static void main(String[] args)
	 {
		 printMissingNumber(new int[]{1,4,6,8,9},10);
		 System.out.println(getMissingNumber(new int[]{1,2,4,5},5));
	 }
}
