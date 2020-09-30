package JavaActivity4_2;

import java.io.File;
import java.io.IOException;

import javax.xml.crypto.Data;

import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) throws IOException {
	
		try {
			//Create file object instance and create a file in the root folder
			File file =new File("sampleTestFile.txt");
			file.createNewFile();
			
			//get the file object and read the data in it
			File fileutil=FileUtils.getFile("C:\\Users\\ShruthiGokul\\eclipse-workspace\\Alchemy\\sampleTestFile.txt");
			System.out.println("The content in file is:"+FileUtils.readFileToString(fileutil, "UTF8"));
			
			//Create directory
			File destination=new File("resources");
			//Copy file to directory
			
			 FileUtils.copyFileToDirectory(file, destination);
			 
			 //Get file from new directory
	         File newFile = FileUtils.getFile(destination, "sampleTestFile.txt");
	         //Read data from file
	         String newFileData = FileUtils.readFileToString(newFile, "UTF8");
	         System.out.println("Data in new file is:" +newFileData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
						
	}
	
	
		

}
