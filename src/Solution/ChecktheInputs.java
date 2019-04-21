package Solution;
/* The user can input all kinds of the information about CTAStation in this class, the class can check these input is right 
 * or not
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:ChecktheInputs
*/
public class ChecktheInputs {
	public void checkInputs(Sub_CTAArrayListj allstops1){
		CTA_inputj totalInput=new CTA_inputj();
		String station_name;
		boolean ADA, RedLine, BlueLine, GreenLine,BrownLine,PurpleLine,PinkLine,YellowLine,OrangeLine;
		int N_Ticket,Stop_ID;
		char Coupon;
		int Discount=0;
		double Lat,Lon;
		boolean flag=false;
		CTAStationj stop=new Coupon_CTAStationj();
		
		System.out.println("Enter your stop ID");
		Stop_ID=totalInput.getStopID();
		
		System.out.println("Enter your station name ");
		station_name=totalInput.getName();
		
		System.out.println("Enter your station ADA ");
		ADA=totalInput.getADA();
		
		System.out.println("Is it the RedLine?");
		RedLine=totalInput.getLine();
		
		System.out.println("Is it the BlueLine?");
		BlueLine=totalInput.getLine();
		
		System.out.println("Is it the GreenLine?");
		GreenLine=totalInput.getLine();
		
		System.out.println("Is it the BrownLine?");
		BrownLine=totalInput.getLine();
		
		System.out.println("Is it the PurpleLine?");
		PurpleLine=totalInput.getLine();
		
		System.out.println("Is it the PinkLine?");
		PinkLine=totalInput.getLine();
		
		System.out.println("Is it the YellowLine?");
		YellowLine=totalInput.getLine();
		
		System.out.println("Is it the OrangeLine?");
		OrangeLine=totalInput.getLine();
		
		System.out.println("Enter your latitude");
		Lat=totalInput.getLat();
		
		System.out.println("Enter your longitude");
		Lon=totalInput.getLon();
		
		Locationj pos=new Locationj(Lat,Lon);
		
		System.out.println("Enter the number of ticket?");
		N_Ticket=totalInput.getNumOfTicket();
		
		while(!flag){
			System.out.println("Can this station used a coupon? y/n");
			Coupon=totalInput.getChar();
			switch (Coupon){
			case 'y':
			case 'Y':  System.out.println("Enter your coupon amount: ");
					Discount=totalInput.getCoupon();
				
					flag=true;
					stop=new CTAStationj(Stop_ID,station_name,ADA,RedLine,BlueLine,GreenLine,BrownLine,PurpleLine,PinkLine,YellowLine,OrangeLine,pos,N_Ticket);
					break;
			case 'n':
			case 'N':  flag=true; 
					stop=new Coupon_CTAStationj(Stop_ID,station_name,ADA,RedLine,BlueLine,GreenLine,BrownLine,PurpleLine,PinkLine,YellowLine,OrangeLine,pos,N_Ticket,Discount);
					break;
			default:   System.out.println("Invalid choice. Please enter again");
			}
		}
		if(allstops1.seqSearch(stop.getStation_Name())>=0){
			System.out.println("Yes. your stop is found");
		}
		else{
			System.out.println("Sorry. your stop isn't found");
		}
	}

}
