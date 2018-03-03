package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		
		ClassOne cl1 = new ClassOne(100, "--some string--");
		
		System.out.println(cl1);
		
		//InterfaceOne in1 = cl1;
		
		//System.out.println(in1.getString());
		
		//in1.setString("string setted to classOne through InterfaceOne");
		
		System.out.println(cl1.getString());
		
		GetString gs = cl1;
		
		System.out.println(gs.getString());
		
		
				
	}

}
