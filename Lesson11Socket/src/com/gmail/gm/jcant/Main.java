package com.gmail.gm.jcant;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("START");
		
		try {
			ServerSocket s = new ServerSocket(20000);
			Socket incoming = s.accept();
			
			try {
				Scanner sc = new Scanner(incoming.getInputStream());
				PrintWriter out = new PrintWriter(incoming.getOutputStream(), true);
				boolean exit = true;
				
				while(exit) {
					String line = sc.nextLine();
					out.println("Server answer: "+line);
					if(line.compareTo("exit") == 0) exit = false;
				}
			}
			finally {
				incoming.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("END");

	}

}
