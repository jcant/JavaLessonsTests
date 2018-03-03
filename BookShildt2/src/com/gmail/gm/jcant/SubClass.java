package com.gmail.gm.jcant;

public class SubClass extends BaseClass{

	public SubClass() {
		super();
	}
	
	public void Print() {
		System.out.println("default: "+x_default);
		System.out.println("protected: "+x_protected);
		System.out.println("public: "+x_public);
		//System.out.println("private: "+x_private); //do not have accesses
	}
}
