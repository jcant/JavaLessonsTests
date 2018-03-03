package com.gmail.gm.jcant;

public class Holder {
	
	int x;

	public Holder(int x) {
		super();
		this.x = x;
	}

	public Holder() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Holder [x=" + x + "]";
	}
	
	public void Processing(GetString gSIF, String str) {
		System.out.println(gSIF.modifyString(str));
	}

}
