package com.venkatesh.java;

import com.venkatesh.java.bufferedereader.BufferedReaderWriteApp;

public class JavaPlayGroundMain {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		BufferedReaderWriteApp bufferedReaderWriteApp=
				new BufferedReaderWriteApp();
		
		bufferedReaderWriteApp.writeFile();
		bufferedReaderWriteApp.readFile();
			
	}

}
