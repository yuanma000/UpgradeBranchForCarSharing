package Solution;
/*This class stores all the choices in this project.It also can be shown these choices.
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:Menuj
*/

import java.util.Scanner;
import java.io.*;

public class Menuj {
	//1.instance variable;
	private String[] strarray;
	
	//2.nodefault constructor
	public  Menuj(int array_size){
		
	    strarray=new String[array_size];
	}
			
	//3.menu()
	public void menu(String[] array){
		for(int i=0; i<array.length; i++){
			strarray[i]=array[i];
		}
	}
	
	//4.getChoice()
			public int getChoice(){
				boolean done=true;
				Scanner keyboard=new Scanner(System.in);
				int Choice;
				String Line;
				while(done){
					System.out.println("Please enter a choice:");
					 Line=keyboard.nextLine();
					try{
							
						 Choice=Integer.parseInt(Line);
					     
						return Choice;
						
					}catch(NumberFormatException e) {
						System.out.println("Could not convert to int,please type another choice.");
						return -1;
						
					}
				}
				return -1;
			}
			
	//5.displayMenu()
	public void displayMenu(){
		String command="1.selection sort purpleLine;2.Bubble sort pinkLine; 3 Insertion sort orangeLine; 4.Sequential Search; 5.Binary Search;6.Add CTAStation; 7.Add CTAStation with Coupon; 8.Remove CTAStation Pulaski by name; 9.Remove CTAStation Garfield by name; "
				+"10.Find the nearest station to a location;11.Generate a route from a starting station to destination;"
				+ "12.Polymorphism;13.Write output file;14.Recovering from errorneous all kind of inputs";
		System.out.println(command);
	}
}
