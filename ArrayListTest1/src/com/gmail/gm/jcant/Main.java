package com.gmail.gm.jcant;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Apple> apples = new ArrayList<Apple>();
		
		apples.add(new Apple("Champion"));
		apples.add(new Apple("Semirenko"));
		apples.add(new Apple("Ogonyok"));
		apples.add(new Apple("Dekabrist"));

		printList(apples);
		
		for (Apple apple : apples) {
			apple.setName("bbb");
		}
		
		System.out.println("**************");
		
		printList(apples);
		
		
		Apple[] apples2 = new Apple[] { new Apple("Aaa1"),new Apple("Aaa2"),new Apple("Aaa3")};
		System.out.println("-----");
		printArray(apples2);
		for (Apple apple : apples2) {
			apple.name="asas";
		}
		System.out.println("-----");
		printArray(apples2);
		
		
	}
	
	public static void printList(ArrayList<Apple> arr) {
		for (Apple apple : arr) {
			System.out.println(apple);
		}
	}
	
	public static void printArray(Apple[] arr) {
		for (Apple apple : arr) {
			System.out.println(apple);
		}
	}

}
