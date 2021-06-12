package project01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Searchfile {
	
	public  void search() throws IOException
	{
		System.out.println( "Enter Filename for Search ## example demo.txt");
		Scanner sc = new Scanner(System.in);
		 boolean isWrongAnswer;
		 do {
		    isWrongAnswer = false;
		    String filename = sc.next();
		    
		    File myObj = new File(Welcome.folderpath+""+filename); 
		    if (myObj.exists()) {
	    	   
				System.out.println("File Found, the file: "+Welcome.folderpath + myObj.getName());
			} else {
				System.out.println("File is not Exist.");
			}
			Welcome.fileoperationmenu();
		 }while (isWrongAnswer);
		
	}

}
