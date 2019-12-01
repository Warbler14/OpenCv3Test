package com.vision.main;

import org.opencv.core.Core;

import com.vision.process.CalcHist;

public class CalcHistDemo {
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		String filename1 = args.length > 0 ? args[0] : getResourceFilePath("lena.jpg");
		String filename2 = args.length > 0 ? args[0] : getResourceFilePath("lena-gray.jpg");
		
//		new CalcHist().start(filename1);
//		new CalcHist().start(filename2);
		new CalcHist().start(filename1, filename1);
		new CalcHist().start(filename1, filename2);
	}
	
	public static String getResourceFilePath(final String fileName) {		
		return System.getProperty("user.dir")  + "\\resources\\" + fileName;
	}
}
