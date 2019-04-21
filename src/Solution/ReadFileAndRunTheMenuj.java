package Solution;
/*This class read the csv file into eight cta lines, then instance an object of menuj.
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:OutFilej
*/
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadFileAndRunTheMenuj {
	public  void readFileAndselectChoice(){
		Sub_CTAArrayListj  redLine=new Sub_CTAArrayListj();
		Sub_CTAArrayListj   blueLine=new Sub_CTAArrayListj ();
		Sub_CTAArrayListj   greenLine=new Sub_CTAArrayListj ();
		Sub_CTAArrayListj   brownLine=new Sub_CTAArrayListj ();
		Sub_CTAArrayListj  purpleLine=new Sub_CTAArrayListj();
		Sub_CTAArrayListj  yellowLine=new Sub_CTAArrayListj();
		Sub_CTAArrayListj pinkLine=new Sub_CTAArrayListj();
		Sub_CTAArrayListj  orangeLine=new Sub_CTAArrayListj();
		
		//polymorphism
		CTAStationj anStop=new Coupon_CTAStationj();
		Locationj pos;
		try{
			String fileName="src\\CTA_CJ\\CTA_System_Information_Stops.csv";
			FileReader aFile=new FileReader(fileName);
			Scanner inFile=new Scanner(aFile);
			String line=" ";
			String[] parts;
			
			while(inFile.hasNext()){
				line=inFile.nextLine();
				//System.out.println(line);
				parts=line.split(",");
			
				int Stop_ID=Integer.parseInt(parts[0]);
			
				String Station_Name=parts[1];
				boolean ADA=Boolean.parseBoolean(parts[2]);
				boolean Red=Boolean.parseBoolean(parts[3]);
				boolean Blue=Boolean.parseBoolean(parts[4]);
				boolean Green=Boolean.parseBoolean(parts[5]);
				boolean Brn=Boolean.parseBoolean(parts[6]);
				boolean Purp=Boolean.parseBoolean(parts[7]);
				boolean Yellow=Boolean.parseBoolean(parts[8]);
				boolean Pnk=Boolean.parseBoolean(parts[9]);
				boolean Org=Boolean.parseBoolean(parts[10]);
			
				double Lat=Double.parseDouble(parts[11]);
			
				double Lon=Double.parseDouble(parts[12]);
                pos=new Locationj(Lat,Lon);
			
				int N_Ticket=Integer.parseInt(parts[13]);
				
				if(parts.length==14){
					anStop=new CTAStationj(Stop_ID,Station_Name,ADA,Red,Blue,Green,Brn,Purp,Yellow,Pnk,Org,pos,N_Ticket);
					
				}else if(parts.length==15){
				    int Coupon=Integer.parseInt(parts[14]);
				    //polymorphism
				    anStop=new Coupon_CTAStationj(Stop_ID,Station_Name,ADA,Red,Blue,Green,Brn,Purp,Yellow,Pnk,Org,pos,N_Ticket,Coupon);
				   
				}
				
			    
				
				if(anStop.getRed()==true){
					redLine.add(anStop);
					
				}else if(anStop.getBlue()==true){
					blueLine.add(anStop);
					
				}else if(anStop.getGreen()==true){
					greenLine.add(anStop);
				}else if(anStop.getBrn()==true){
					brownLine.add(anStop);
				}else if(anStop.getPurp()==true){
					purpleLine.add(anStop);
				}else if(anStop.getYellow()==true){
					yellowLine.add(anStop);
				}else if(anStop.getPnk()==true){
					pinkLine.add(anStop);
					
				}else if(anStop.getOrg()==true){
					orangeLine.add(anStop);
				}else{
					;
					}
				
			}
			redLine.selectSort();
			
			blueLine.bubbleSort();
			
			greenLine.insertionSort();
			
			brownLine.selectSort();
			
			yellowLine.selectSort();
			
			
			//declare and instantiates an instance of Menu
			int number=30;
			Menuj amenu=new Menuj(number);
			int choice=9;
			//loops to display menu of display options
			while(true){
				amenu.displayMenu();
				choice=amenu.getChoice();
				//exit
				if (choice == -1){
					break;
				}
				
				JobAndDisplayj object=new JobAndDisplayj();
				//choose orland square mall as the location
				Locationj Orland_Square_Mall_pos=new Locationj(41.6200326, -87.8483865);
				
				Locationj start_pos=new Locationj(41.983507,-87.859388);
				CTAStationj start_station=new CTAStationj(2,"Rosemont (Blue Line)",true,false,true,false,false,false,false,false,false,start_pos,3);

				
				object.job(choice,redLine, blueLine, greenLine, brownLine, purpleLine, pinkLine, yellowLine,orangeLine,"Indiana (Green Line)","Cicero (Green Line)",Orland_Square_Mall_pos,start_station);
			}
		  System.out.println("The program finishes");
		}
		catch(FileNotFoundException fnfe){
			System.out.println(fnfe.toString());
			System.out.println(fnfe.getMessage());
			System.out.println("This file cann't be found");
		}catch(NumberFormatException n){
			System.out.println("Could not convert to int");
		}
		
		
	}

}
