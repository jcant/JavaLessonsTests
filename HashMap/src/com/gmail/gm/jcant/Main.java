package com.gmail.gm.jcant;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Student> hm = new HashMap<>();
		// TreeMap<String, Student> hm = new TreeMap<>();

		hm.put("Petrov", new Student("Petrov Petr Petrovich", "physics", 2, 9.8));
		hm.put("Padrov", new Student("Sidorov Sidor Sidorovich", "phylosophy", 2, 9.8));
		hm.put("Pvanov", new Student("Ivanov Ivan Ivanovich", "geography", 2, 9.8));

		System.out.println(hm.get("Petrov"));
		System.out.println();

		print(hm);

		Student a = hm.get("Pvanov");
		a.FIO = "VVV VVV VVV";

		print(hm);

		hm.put("Pvanov", a); // not necessary because "a" is a refer to 'Student' object in HashMap
								// Changing values of "a" cause changing value of HashMap object "Ivanov" (it is
								// the same object)

		print(hm);

		// for TreeMap:
		// Map.Entry<String, Student> entry = hm.ceilingEntry("P"); // find first entry
		// if (entry != null) {
		// System.out.println(entry.getKey() + "\t" + entry.getValue());
		// } else {
		// System.out.println("Not found!");
		// }
	}

	public static <T, M> void print(Map<T, M> hm) {
		Set<Map.Entry<T, M>> hms = hm.entrySet();

		for (Map.Entry<T, M> entry : hms) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		System.out.println();
	}

}
