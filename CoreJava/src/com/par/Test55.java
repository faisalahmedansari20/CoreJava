package com.par;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test55 {

	public static void main(String args[]) {
		int i = MK.i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int x = sc.nextInt();
		System.out.println("enter second number");
		int y = sc.nextInt();
		try {
			int z = x / y;
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}

	}
}


class MK
{
	static int i =39;
}