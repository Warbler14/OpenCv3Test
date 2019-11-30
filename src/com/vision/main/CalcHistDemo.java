package com.vision.main;

import org.opencv.core.Core;

import com.vision.process.CalcHist;

public class CalcHistDemo {
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		String filename = args.length > 0 ? args[0] : getResourceFilePath("lena.jpg");
		
		
		new CalcHist().start(filename);
	}
	
	public static String getResourceFilePath(final String fileName) {		
		return System.getProperty("user.dir")  + "\\resources\\" + fileName;
	}
}
