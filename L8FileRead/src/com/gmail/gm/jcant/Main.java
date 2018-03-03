package com.gmail.gm.jcant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File file = new File("src/com/gmail/gm/jcant/Main.java");
		String str = fileRead(file);
		System.out.println(str);
		str = fastFileRead(file);
		System.out.println(str);

	}

	public static String fileRead(File f) {
		StringBuilder sb = new StringBuilder();
		try (Scanner sc = new Scanner(f)) {
			while (sc.hasNextLine()) {
				sb.append(sc.nextLine());
				sb.append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return sb.toString();
	}

	public static String fastFileRead(File f) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String txt = "";
			while ((txt = br.readLine()) != null) {
				sb.append(txt);
				sb.append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return sb.toString();
	}

}
