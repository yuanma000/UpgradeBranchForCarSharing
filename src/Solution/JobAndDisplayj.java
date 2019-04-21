package Solution;
/*This class can show the array after we add,delete,sort,search and so so. And the job method can show what choice can we 
 * choose in this project.
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:CTAStationj
*/
public class JobAndDisplayj {

	//job()
	public static void job(int choice,Sub_CTAArrayListj redline,Sub_CTAArrayListj blueline,Sub_CTAArrayListj greenline,Sub_CTAArrayListj brownline,Sub_CTAArrayListj purpleline,Sub_CTAArrayListj pinkline,Sub_CTAArrayListj yellowline,Sub_CTAArrayListj orangeline,String station_name1,String station_name2,Locationj location,CTAStationj start_station){
		switch(choice){
		case 1:displaySelectSort(purpleline);break;
		case 2:displayInsertSort(pinkline);break;
		case 3:displayBubbleSort(orangeline);break;
		case 4:displayseqSearch(greenline,station_name1);break;
		case 5:displaybinSearch(greenline,station_name2);break;
		case 6:displayAddStation(greenline);break;
		case 7:displayAddCouponstation(greenline);break;
		case 8:displayRemovePulaski(greenline);break;
		case 9:displayRemoveGarfield(greenline);break;
		case 10:displaytheNearestStation(blueline,location);break;
		case 11:displayRoute(blueline,location,start_station);break;
		case 12:displayPolymorphism();break;
		case 13:displayoutPutFile(brownline);break;
		case 14:ChecktheInputs object=new ChecktheInputs();
		         object.checkInputs(redline);break;
		default:
              System.out.println("I'm sorry, but I didn't understand that.");         
		}
	}
	
	
	//select sort()-greenline
	public static void displaySelectSort(Sub_CTAArrayListj greenline){
		greenline.selectSort();
		displayStationName(greenline);
	}
	
	//insert sort()-redline
	public static void displayInsertSort(Sub_CTAArrayListj redline){
		redline.insertionSort();
		displayStationName(redline);
		
	}
	
	//bubble sort()-blueline
	public static void displayBubbleSort(Sub_CTAArrayListj blueline){
		blueline.bubbleSort();
		displayStationName(blueline);
	}
	
	//sequential Search()
	public static void displayseqSearch(Sub_CTAArrayListj line,String station_name){
		int position=line.seqSearch(station_name);
		System.out.println("The position of Indiana (Green Line) by sequential Search is : "+position);
	}
	
	//binary Search()
	public static void displaybinSearch(Sub_CTAArrayListj line,String station_name){
		int position=line.binSearch(station_name);
		System.out.println("The position of Cicero (Green Line) by binary Search is :"+position);
	}
	
	//displayAddStation()--without coupon
	public static void displayAddStation(Sub_CTAArrayListj line){
		Locationj pos1=new Locationj(41.778943,-87.644244);
		CTAStationj Halsetedstop=new CTAStationj(28,"Halsted",true,false,false,true,false,false,false,false,false,pos1,2);
		line.add(Halsetedstop);
		displayStationName(line);
	}
	
	//displayAddStation()--with coupon
	public static void displayAddCouponstation(Sub_CTAArrayListj line){
		Locationj pos2=new Locationj(41.77886,-87.663766);
		CTAStationj Ashlandstop=new Coupon_CTAStationj(29,"Ashland/63rd",true,false,false,true,false,false,false,false,false,pos2,3,1);
		line.add(Ashlandstop);
		displayStationName(line);
	}
	
	//displayRemoveStation()-Pulaski
	public static void displayRemovePulaski(Sub_CTAArrayListj line){
		int pos=line.seqSearch("Pulaski (Green Line)");
		line.delete(pos);
		System.out.println("After delete Pulaski (Green Line), the greenline is shown below:");
		displayStationName(line);
	}
	
	//displayRemoveStation()-Garfield
	public static void displayRemoveGarfield(Sub_CTAArrayListj line){
		int pos=line.seqSearch("Garfield (Green Line)");
		line.delete(pos);
		
		System.out.println("After delete Garfield (Green Line), the greenline is shown below:");
		displayStationName(line);
	}
	
	//find the nearest station to a location
	public static CTAStationj displaytheNearestStation(Sub_CTAArrayListj line,Locationj location){
		double lat=location.getLat();
		double lon=location.getLon();
		
		CTAStationj first_stop=line.getElement(0);
		double nearest=first_stop.getPos().calcDistance(lat,lon);
		CTAStationj nearest_station=first_stop;
		for(int i=0; i<line.getIndex(); i++){
			CTAStationj current =line.getElement(i);
			if(current.getPos().calcDistance(lat,lon)<nearest){
				nearest=current.getPos().calcDistance(lat,lon);
				nearest_station=current;
			}
			
		}
		System.out.println("The nearest stop to the location is "+ nearest_station);
		return nearest_station;
	}
	
	
	//display a route from a starting station to destination
	public static void displayRoute(Sub_CTAArrayListj line,Locationj location,CTAStationj start_station){
		CTAStationj nearest_station=displaytheNearestStation(line, location);
		String final_station=nearest_station.getStation_Name();
		
		int final_pos=line.seqSearch(final_station);
		
		int start_pos=line.seqSearch(start_station.getStation_Name());
	
		System.out.println("The route is shown below:");
		
		for(int i=start_pos; i<=final_pos;i++){
			System.out.println(line.getElement(i).getStation_Name());
		}
		
	}
	
	
	//polymorphism
	public static void displayPolymorphism(){
		
		CTAStationj station=new Coupon_CTAStationj();
		
		double subclass_price=station.calcTotalTicketPrice();
	
		System.out.println("The total ticket price in Coupon_CTAStation(subclass) object: "+subclass_price);
		
		CTAStationj station1=new CTAStationj();
		
		double superclass_price=station1.calcTotalTicketPrice();
		
		System.out.println("The total ticket price in CTAStation(superclass) object :"+superclass_price);
	}
	
	//write output file
	public static void displayoutPutFile(Sub_CTAArrayListj line){
		OutFilej object=new OutFilej();
		object.outPutFile(line);
	}
	
	//dispalyStationName()
	public static void displayStationName(Sub_CTAArrayListj line){
		for(int i=0; i<line.getIndex(); i++){
			CTAStationj station=line.getElement(i);
			String station_name=station.getStation_Name();
			//display names of stations
			System.out.println(station_name);
		}
	}
}
