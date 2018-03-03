package com.gmail.gm.jcant;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] a = generateArray();
		int[] b = generateArray();
		int[] c = generateArray();

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

		System.out.println("Total sum=" + (getArraySum(a) + getArraySum(b) + getArraySum(c)));
		System.out.println();

		System.out.println("Total sum2=" + getArraySum(a, b, c));
		System.out.println();

	}

	public static int[] generateArray() {
		int[] array = new int[5 + (int) (Math.random() * 16)];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		return array;
	}

	public static int getArraySum(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}

	public static int getArraySum(int[] a, int[] b, int[] c) {
		int sum = 0;
		int i = 0;

		boolean arrA = false;
		boolean arrB = false;
		boolean arrC = false;

		while (!(arrA && arrB && arrC)) {
			if (!arrA) {
				try {
					sum += a[i];
				} catch (ArrayIndexOutOfBoundsException e) {
					arrA = true;
					System.out.println("A");
				}
			}

			if (!arrB) {
				try {
					sum += b[i];
				} catch (ArrayIndexOutOfBoundsException e) {
					arrB = true;
					System.out.println("B");
				}
			}

			if (!arrC) {
				try {
					sum += c[i];
				} catch (ArrayIndexOutOfBoundsException e) {
					arrC = true;
					System.out.println("C");
				}
			}

			i++;
		}
		return sum;
	}

}
