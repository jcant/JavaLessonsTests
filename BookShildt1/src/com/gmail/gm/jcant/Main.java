package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'à', 'Ü', 'ñ', 'd', 'å', 'f' };
		String[] duo = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", 
						 "1010", "1011", "1100", "1101", "1110", "1111" };

		byte b = (byte) 0xf1;
		byte c = (byte) (b >> 4);
		byte d = (byte) (b >>> 4);
		byte e = (byte) ((b & 0xff) >> 4);

		System.out.println("Ü = 0õ" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]+"("+duo[(b >> 4) & 0x0f] + duo[b & 0x0f]+")");
		System.out.println("Ü >> 4 = 0õ" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f] +"("+duo[(c >> 4) & 0x0f] + duo[c & 0x0f]+")");
		System.out.println("Ü >>> 4 = 0õ" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f] +"("+duo[(d >> 4) & 0x0f] + duo[d & 0x0f]+")");
		System.out.println("(b & 0xff) >> 4 = 0õ" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f] +"("+duo[(e >> 4) & 0x0f] + duo[e & 0x0f]+")");

	}

}
