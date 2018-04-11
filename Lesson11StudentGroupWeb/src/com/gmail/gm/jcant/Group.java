package com.gmail.gm.jcant;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private String name;
	private List<Student> al = new ArrayList<>();

	public Group(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addStudent(Student a) {
		al.add(a);
	}

	public Student[] getGroup() {
		Student[] starr = new Student[al.size()];
		for (int i = 0; i < al.size(); i++) {
			starr[i] = al.get(i);
		}

		return starr;
	}
}
