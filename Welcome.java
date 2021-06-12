package project01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Welcome {
	
	static int started=0;
	static String folderpath="D:\\data2\\";
	
	public static void main(String[] args) {
		
		if(started==0)
		{
		System.out.println("Welcome to Project 1");
		System.out.println("#################################");
		System.out.println("Ali Saad-- MS FSD MAY 2021 Cohort 1");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		}
		
		
		try {
			firstmenu();
			started=1;
        
	    
		}catch(Exception ee) {
			
			System.out.println("Input Error or Invalid Input");
			//main(null);
			
		}
		
		
	
		
	}
	
	public static void firstmenu() {

		 Scanner sc = new Scanner(System.in);
		 boolean isWrongAnswer;
		 do {
		    isWrongAnswer = false;
		    System.out.println("Main Menu");
		    System.out.println("Press 1 : list of file ");
		    System.out.println("Press 2 : File Operation ");
		    System.out.println("Press 3 : Exit ");
		    switch (sc.nextInt()) {
		        case 1:
		        	filelist();
		            break;
		        case 2:
		        	fileoperationmenu();
		            break;
		        case 3:
		        	System.exit(0);
		            break;
		        default:
		           System.out.println("choose from 1 to 3");
		           isWrongAnswer = true;
		        }
		 } while (isWrongAnswer);
		 
		 
		}
	
	public static void filelist()
	{
		System.out.println("filelist");
		ArrayList<String> names =null;
	
		try {
		File f = new File(folderpath);
		names = new ArrayList<String>(Arrays.asList(f.list()));
		Collections.sort(names);
		if(names.size()==0)
		{
			System.out.println( "no file in the folder");
		}
		}catch(Exception ee) {
			System.out.println(ee.getMessage());
		}
		System.out.println(names.toString());
		firstmenu() ;
	}

	
	public static void fileoperationmenu() {
		try {
			
			System.out.println( "Welcome to File operations");
			Scanner sc = new Scanner(System.in);
			 boolean isWrongAnswer;
			 do {
			    isWrongAnswer = false;
			    System.out.println("File Menu");
			    System.out.println("Press 1 : Add file ");
			    System.out.println("Press 2 : Delete file");
			    System.out.println("Press 3 : Search file ");
			    System.out.println("Press 4 : Back to main menu");
			    switch (sc.nextInt()) {
			        case 1:
			        	Createfile add = new Createfile();
			        	add.add();
			            break;
			        case 2:
			        	
			        	Deletefile del = new Deletefile();
			        	del.delete();
			            break;
			        case 3:
			        	Searchfile search = new Searchfile();
			        	search.search();
			            break;
			        case 4:
			        	firstmenu(); 
			            break; 
			        default: 
			           System.out.println("choose from 1 to 4");
			           isWrongAnswer = true;
			        }
			 } while (isWrongAnswer);
			 
			 
		}
		catch(Exception ee){
			
		}
		
		
	}
	
	
	
	
	
	
}
