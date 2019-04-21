package Solution;
/*This class includes all inputs method about a CTA_Station. This class can recover erroneous from all kinds of input.
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:CTA_inputj
*/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CTA_inputj {
	
	
		//1.getName()
		public String getName(){
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String name="";
			boolean done = false;
			do{
				try{
					
					name=in.readLine();
					if("".equals(name.trim())){
						System.out.println("Your input is empty.Please enter again ");
					}
					else{
						done=true;
					}
				}catch (IOException e) {		
					System.out.println("I can't read this input ");
				}
			}while(!done);
			return name;
			
		}
		
		//2.getADA()
		public boolean getADA(){
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputADA="";
			Boolean ADA=true;
			boolean done = false;
			do{
				try{
						
					inputADA=in.readLine();
					if("".equals(inputADA.trim())){
						System.out.println("Your input is empty.Please enter again ");
					}else if((inputADA.equalsIgnoreCase("true"))||(inputADA.equalsIgnoreCase("false"))){
						
                        ADA=Boolean.parseBoolean(inputADA);
						done=true;
						
					}else{
						System.out.println("Your ADA input is not correct.Please enter again ");
						}
					}
				catch (IOException e) {		
					System.out.println("I can't read this input ");
				}
			}while(!done);
			return ADA;
		}
		
		//3.getLine()
		public boolean getLine(){
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine="";
			Boolean Line=true;
			boolean done = false;
			do{
				try{
					
					inputLine=in.readLine();
					if("".equals(inputLine.trim())){
						System.out.println("Your input is empty.Please enter again ");
					}else if((inputLine.equalsIgnoreCase("true"))||(inputLine.equalsIgnoreCase("false"))){
						
                        Line=Boolean.parseBoolean(inputLine);
						done=true;
						
					}else{
						System.out.println("Your Line input is not correct.Please enter again ");
						}
					}
					
				catch (IOException e) {		
					System.out.println("I can't read this input ");
				}
			}while(!done);
			return Line;
		}
		
		//4.getNumofTicket()
		public int getNumOfTicket(){
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputNumber = "";
			int digit =0;
			boolean done = false;
		
			do {
				
				try {
					inputNumber = in.readLine();
					if (!checkDigit(inputNumber)) {
						System.out.println("Please enter again. Input is not an Integer");
					} 
					else{
						digit = Integer.parseInt(inputNumber);
						
						done=true;
					}
					
				}catch (NumberFormatException n) {
					System.out.println("Could not convert to int. Please enter an integer");
				}catch (IOException e) {		
					System.out.println("I can not read this input ");
				}
			} while (!done);
		
			return digit;
		}
		
		
		//5.getCoupon()
		public int getCoupon(){
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputDiscount = "";
			int discount = -1;
			boolean done = false;
		
			do {
				
				try {
					inputDiscount = in.readLine();
				
					if(!checkDigit(inputDiscount)){
						System.out.println("Invalid input. Please enter again");
					}
					else{
					discount = Integer.parseInt(inputDiscount);
					}
				}catch (NumberFormatException n) {
					System.out.println("Could not convert to int. Please enter a int");
				}catch (IOException e) {		
					System.out.println("Could not read input ");
				}
				
				if(discount==0){
					System.out.println("Invalid input. Please enter a positive integer");
				}
				else if(discount>0){
					done=true;
				}
			} while (!done);
			return discount;
		}
		
		//6.checkDigit()
		public boolean checkDigit(String number)
		{
			for (int i=0; i<number.length(); i++)
			{
				if (!Character.isDigit(number.charAt(i)))
					return false;
			}return true;
		}
		
		//7.getStopID()
		public int getStopID(){
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputNumber = "";
			int ID =0;
			boolean done = false;
		
			do {
				
				try {
					inputNumber = in.readLine();
					if (!checkDigit(inputNumber)) {
						System.out.println("Please enter again. Input is not an Integer");
					} 
					else{
						ID = Integer.parseInt(inputNumber);
						
						done=true;
					}
					
				}catch (NumberFormatException n) {
					System.out.println("Could not convert to int. Please enter an integer");
				}catch (IOException e) {		
					System.out.println("I can not read this input ");
				}
			} while (!done);
		
			return ID;
		}
				
		//8.getChar()
		public char getChar(){
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String string="";
			boolean done = false;
			char aChar=' ';
			do{
				try{	
				string=in.readLine();
					if("".equals(string.trim())){
						System.out.println("Your input is empty. Please enter again ");
					}
					else if(string.length()>1){
						System.out.println("Invalid input. Please enter again ");
					}
					else{
						aChar=string.charAt(0);
						done=true;
					}
				}catch (IOException e) {		
					System.out.println("Could not read input ");
				}
			}while(!done);
			 return aChar;
		}	
		
		//9.checkDouble()
		public boolean checkDouble(String number)
		{
			char c=new Character('.');
			for (int i=0; i<number.length(); i++)
			{
				if ((!Character.isDigit(number.charAt(i)))&&((number.charAt(i))!=(c))&&((number.charAt(i)!='-'))){
					return false;
				}
			}
			
			if(checkDigit(number)){
				return false;
			}
			
			return true;
		}
		
		//10.getLat()
		public double getLat(){
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLatitude =" ";
			double Lat =0;
			boolean done = false;
		
			do {
				try
				 {
					inputLatitude = in.readLine();
					if (!checkDouble(inputLatitude)) {
						System.out.println("Please enter again. Input is not an Double");
					} 
					else{
						Lat = Double.parseDouble(inputLatitude);
						done=true;
					}
					
				}catch(IOException e) {		
					System.out.println("I can not read this input ");
				}
			} while (!done);
		  
			return Lat;
		}
		
		
		//11.getLon()
		public double getLon(){
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLongitude = "";
			double Lon =0;
			boolean done = false;
		
			do {
				
				try {
					inputLongitude = in.readLine();
					if (!checkDouble(inputLongitude)) {
						System.out.println("Please enter again. Input is not an Double");
					} 
					else{
						Lon = Double.parseDouble(inputLongitude);
						
						done=true;
					}
					
				}catch (IOException e) {		
					System.out.println("I can not read this input ");
				}
			} while (!done);
		
			return Lon;
		}
}
