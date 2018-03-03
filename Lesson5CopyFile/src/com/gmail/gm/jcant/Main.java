package com.gmail.gm.jcant;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
//		File from = new File("/home/jcant/tmp/test.pdf");
//		File to = new File("/home/jcant/tmp/test2.pdf");
//
//		try {
//			FileOperation.fileCopy(from, to);
//		} catch (IOException e) {
//			System.out.println("Вывалились по исключению:");
//			e.printStackTrace();
//		}
		
		//System.out.println(FileOperation.getSize(new File("/home/jcant/tmp")));
		
		try(DataOutputStream f = new DataOutputStream(new FileOutputStream("b.txt"))){
			
			f.writeInt(17);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
