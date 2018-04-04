package com.gmail.gm.jcant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		
		a.add(12);
		a.add(13);
		a.add(45);
		
		b.add(11);
		b.add(2);
		b.add(5);
		
		System.out.println(Collections.disjoint(a, b));
		
	}

}
