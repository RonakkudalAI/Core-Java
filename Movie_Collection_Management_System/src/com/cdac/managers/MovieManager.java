package com.cdac.managers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.cdac.model.Movie;


interface IManager{
	void AddMovies();
	void ViewAllMovies();
	
}

public class MovieManager  implements IManager{
	
	ArrayList<Movie> mlist;
	
  public MovieManager() {
	  
	  mlist = new ArrayList<Movie>();
	  mlist.add(new Movie(101,"Jai HO","Ronak kudal","Kanore",4,2002));
	  mlist.add(new Movie(104,"Krish", "Manali","Udaipur",5,2001));
	  mlist.add(new Movie(102,"Dilwale","Rahul","Jaipur",3,2013));
	  mlist.add(new Movie(103,"DDLJ","Priyanka","Jodhpue",2,2020));
	 
			
  }

  //Add Method to add Movie
  @Override
  public void AddMovies() {
	  
	  Scanner sc = new Scanner(System.in);
	  Movie m = new Movie();
	  System.out.println("Enter Movie Id");
	  m.setMovieId(sc.nextInt());
	  System.out.println("Enter Movie Name");
	  m.setTitle(sc.next());
	  System.out.println("Enter Director");
	  m.setDirector(sc.next());
	  System.out.println("Enter Genre");
	  m.setGenre(sc.next());
	  System.out.println("Enter Rating of Movie");
	  m.setRating(sc.nextInt());
	  System.out.println("Enter Date of Realse");
	  m.setRealaseYear(sc.nextInt());
	  
	  mlist.add(m);
	 
	  System.out.println(" movie Record Added Successfully");
	 
  }
  
  	//View Method For Display All Movies
  @Override
  public void ViewAllMovies() {
	  
	  mlist.stream().forEach(m->System.out.println(m));
	
  	}
  
  //Update Method for Updating the Movie
  
  public void UpdateMovie() {
	  	  
	  boolean flag = false;
	  int id;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Movie Id");
	  id = sc.nextInt();
	  for(Movie m : mlist) {
		  
		  
		  if(m.getMovieId()==id) {
			  flag = true;
			  System.out.println("Enter Movie Name ");
			  m.setTitle(sc.next());
			  
			  System.out.println("Enter Director Name");
			  m.setDirector(sc.next());
			  
			  System.out.println("Enter Genre");
			  m.setGenre(sc.next());
			  
			  System.out.println("Enter Rating");
			  m.setRating(sc.nextInt());
			  
			  System.out.println("Enter Realse Date");
			  m.setRealaseYear(sc.nextInt());
			  
			  System.out.println("Record Updated Successfully");
				break;
				
				
		  }
	  }
	  
	  
	  if(flag==false) {
		  
		  System.out.println("No Movie found");
	  	}  
	  
  }
  
  //Delete Method For Deleting The Movies
  
  public void DeleteMovie() {
	  boolean flag = false;
	  int id;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Movie Id");
	  id = sc.nextInt();
	  for(Movie m : mlist) {

		  if(m.getMovieId()==id) {
			  flag = true;
			  
			  mlist.remove(m);
			  System.out.println("Delete Movie Successfully");
 
	  
		   }
            if(flag==false) {
			  
			  System.out.println("No Movie found");
		  	}  
	   } 
	  	
	}
//Search By Movie ID
  public void SearchBYID()
  
  
  {
	  boolean flag = false;
	  int id;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Movie Id");
	  id = sc.nextInt();
	  for(Movie m : mlist) {

		  if(m.getMovieId()==id) {
			  flag = true;
			System.out.println(m);
	  
		  }
		  
		  	if(flag==false) {
			  
			  System.out.println("No Movie found");
		  	}  
  }
	  
	  
	  
  }
  
  
  //Sort By Movies Name
  public void SortRecordByName()
	{
		mlist.stream().sorted((m1,m2)->m1.getTitle().compareTo(m2.getTitle())).forEach(System.out::println);
	} 
  
  //Sort By Director 
  
  public void SortRecordByDirector()
	{
		mlist.stream().sorted((m1,m2)->m1.getDirector().compareTo(m2.getDirector())).forEach(System.out::println);
	} 
  
//Sort By Rating

 
  public void SortRecordByRating()
	{
		//mlist.stream().sorted((m1,m2)->m1.getRating().compareTo(m2.getRating())).forEach(System.out::Println);
		
		Collections.sort(mlist,(m1,m2)->Integer.compare(m1.getRating(), m2.getRating()));
		
		for(Movie m : mlist) {
			System.out.println(m);
		}
	} 
  
  
  
  
  
  
  public void SortRecordByDate()
  {
	  Collections.sort(mlist,(m1,m2)->Integer.compare(m1.getRealaseYear(), m2.getRealaseYear()));
		
		for(Movie m : mlist) {
			System.out.println(m);
		}
	  
	
  }
  
  public void ExitProgram() {
	  System.out.println("Exiting the program");
	  System.exit(0);
	  
	  
	  }
  
  
  
  
}


