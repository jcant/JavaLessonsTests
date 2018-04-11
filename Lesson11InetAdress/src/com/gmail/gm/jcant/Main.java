package com.gmail.gm.jcant;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) {
		InetAddress adress = null;
		
		try {
			adress = InetAddress.getByName("www.google.com");
			
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println(adress);
		
		System.out.println(adress.getHostName());
		
		try {
			int c;
			URL url = new URL("HTTP", adress.getHostName(), 8080, "");
			System.out.println(url.getPort());
			URLConnection urlc = url.openConnection();
			
			System.out.println(urlc.getDate());
			System.out.println(urlc.getContentType());
			long l = urlc.getContentLengthLong();
			if(l!=0) {
				System.out.println();
				InputStream ins = urlc.getInputStream();
				while((c=ins.read())!=-1) {
					System.out.println((char)c);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
