package project01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Deletefile {
	
	
	public void delete() throws IOException
	{
		System.out.println( "Enter Filename to delete ## example demo.txt");
		Scanner sc = new Scanner(System.in);
		 boolean isWrongAnswer;
		 do {
		    isWrongAnswer = false;
		    String filename = sc.next();
		    File myObj = new File(Welcome.folderpath+""+filename); 
		    if (myObj.exists()) {
	    	    myObj.delete();
				System.out.println("Deleted the file: " + myObj.getName());
			} else {
				System.out.println("Failed to delete the file.");
			}
			
			Welcome.fileoperationmenu();
		 }while (isWrongAnswer);
		
	}
	

}
