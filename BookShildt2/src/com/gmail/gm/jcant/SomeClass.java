package com.gmail.gm.jcant;

public class SomeClass {
	
	public BaseClass bc = new BaseClass();
	public SubClass sc = new SubClass();
	
	public SomeClass() {
		super();
	}
	
	public void Print() {
		System.out.println("default: "+bc.x_default);
		System.out.println("default: "+sc.x_default);
		
		System.out.println("protected: "+bc.x_protected);
		System.out.println("protected: "+sc.x_protected);
		
		System.out.println("public: "+bc.x_public);
		System.out.println("public: "+sc.x_public);
		
		//System.out.println("private: "+bc.x_private); //do not have accesses
		//System.out.println("private: "+sc.x_private); //do not have accesses
	}
}
