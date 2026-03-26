package com.cdac.main;

import java.util.Scanner;

import com.cdac.managers.MovieManager;

public class Programm {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		MovieManager manager = new MovieManager();
		
		
		while(true) {
			
			System.out.println("************Movie Management System*************");
			
			System.out.println("Press 1 for Add Movie ");
			System.out.println("Press 2 for View All Movies ");
			System.out.println("Press 3 for Search Movies by Id");
			System.out.println("Press 4 for Update the Movie ");
			System.out.println("Press 5 for Delete the Movie ");
			System.out.println("Press 6 for Sort Movie by Title ");
			System.out.println("Press 7 for Sort Movies by Director ");
			System.out.println("Press 8 for Sort Movies By Rating ");
			System.out.println("Press 9 for Sort Movies By Release year");
			System.out.println("Press 10 for Exitint.........");
		
			System.out.println("========================================================");
			
			System.out.print("Enter Choice: ");
            int ch = sc.nextInt();
			
			try {
				
				switch(ch) {
				
				case 1:
					manager.AddMovies();
					break;
					
				case 2:
					manager.ViewAllMovies();
					break;
					
				case 3:
					manager.SearchBYID();
					
					
				break;
				
				case 4:
					manager.UpdateMovie();
					
					
				break;
				
				case 5 :
					
					manager.DeleteMovie();
				break;

				case 6 :
					manager.SortRecordByName();
					break;
					
				case 7:
				manager.SortRecordByDirector();
					break;
					
				case 8:
					manager.SortRecordByRating();
					
					break;
					
				case 9:
					manager.SortRecordByDate();
					break;
					
				case 10:
					manager.ExitProgram();
					break;
					
				default:
					System.out.println("Enter Correct Input");
					
					
				}
				
					
				
			}catch(Exception e)
            {
                System.out.println(e.getMessage());
			
		
			
            }

		} 	
		
		
	}
}
	


