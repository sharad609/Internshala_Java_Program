package com.module3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_handling {
	//FileOutputStream: Creates and Writes to the File.
	//FileInputStream: Read from File.
	public static void main(String[] args) {
//WRITE Operation:
		String data = "I Love India";

		try{                        //close the code in try-catch block to handle the IOException.
			FileOutputStream fos = new FileOutputStream("myFile.txt");   //creating file object, if file does not exist then file will be created.
			byte[] byteData = data.getBytes();   //always convert data in byte
			fos.write(byteData);
			fos.close();         //always close the file whenever you open it, to prevent memory leakage
		}catch (IOException ex){
			System.out.println("The Exception occur is: "+ex);
		}
//READ Operation:
		try {

			FileInputStream fis = new FileInputStream("myFile.txt");
			int i = 0;
			while ((i = fis.read()) != -1){               //End of file is Represented by -1.
				System.out.print((char) i);
			}
			fis.close();
		}catch (IOException e){
			System.out.println("The Exception occur is: "+e);
		}
	}
}
