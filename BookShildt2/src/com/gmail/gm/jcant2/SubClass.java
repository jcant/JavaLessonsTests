package com.gmail.gm.jcant2;

import com.gmail.gm.jcant.BaseClass;

public class SubClass extends BaseClass {
	public void Print() {
		//System.out.println("default: "+ x_default);
		//System.out.println("default: "+ x_default);
		
		System.out.println("protected: "+ x_protected);
		System.out.println("protected: "+ x_protected);
		
		System.out.println("public: "+ x_public);
		System.out.println("public: "+ x_public);
		
		//System.out.println("private: "+ x_private); //do not have accesses
		//System.out.println("private: "+ x_private); //do not have accesses
	}
}
