package com.gmail.gm.jcant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {

	public static void fileCopy(File from, File to) throws IOException {
		byte[] buffer = new byte[1024 * 1024];
		int readByte = 0;
		try (FileInputStream fis = new FileInputStream(from); FileOutputStream fos = new FileOutputStream(to)) {

			while ((readByte = fis.read(buffer)) > 0) {
				fos.write(buffer, 0, readByte);
			}

		} catch (IOException e) {
			throw e;
		}
	}

	public static long getSize(File target) {

		if (target.isFile()) {

			return target.length();

		} else {
			long result = 0;

			File[] files = target.listFiles();

			for (File file : files) {

				result += getSize(file);
			}

			return result;
		}

	}
}
