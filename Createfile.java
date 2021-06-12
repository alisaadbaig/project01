package project01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Createfile {

	
	public void add() {
	 try {
		 System.out.println( "Enter Filename ## example demo.txt");
		 Scanner sc = new Scanner(System.in);
		 boolean isWrongAnswer;
		 do {
			 isWrongAnswer = false;
			 String filename = sc.next();
	  
		  				
		      File myObj = new File(Welcome.folderpath+""+filename);
		      if (!myObj.exists()) {
		    		myObj.createNewFile(); 
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    
	    
		      Welcome.fileoperationmenu();
		 } while (isWrongAnswer);
	 
	 
	 } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}

	}
