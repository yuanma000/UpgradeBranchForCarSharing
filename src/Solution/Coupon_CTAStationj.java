package Solution;
/*This class includes all the information in one coupon CTAStation. The coupon can make a discount to the total price ticket.
 * This class is a child class of CTAStationj.
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:Coupon_CTAStationj
*/

public class Coupon_CTAStationj extends CTAStationj{
     //instance variable
	private int Coupon;
	
	//default constructor
	public Coupon_CTAStationj(){
		super();
		Coupon=1;
	}
	
	//nondefault constructor
	public Coupon_CTAStationj(int Stop_ID, String Station_Name, boolean ADA, boolean Red, boolean Blue, boolean Green, boolean Brn, boolean Purp, boolean Yellow, boolean Pnk,boolean Org,Locationj pos, int N_ticket,int Coupon){
		super(Stop_ID,Station_Name,ADA,Red,Blue,Green,Brn,Purp,Yellow,Pnk,Org,pos,N_ticket);
		this.Coupon=Coupon;
	}
	
	//mutator
	public void setCoupon(int Coupon){
		this.Coupon=Coupon;
	}
	
	//accessor
	public int getCoupon(){
		return Coupon;
	}
	
	//toString()
	public String toString(){
		return super.toString()+"Coupon: "+Coupon;
	}
	
	//equals()
	public boolean equals(Coupon_CTAStationj other){
		boolean s1=(this.getStop_ID()==other.getStop_ID());
		boolean s2=(this.getStation_Name().equals(other.getStation_Name()));
		boolean s3=(this.getADA()==other.getADA());
		boolean s4=(this.getRed()==other.getRed());
		boolean s5=(this.getBlue()==other.getBlue());
		boolean s6=(this.getGreen()==other.getGreen());
		boolean s7=(this.getBrn()==other.getBrn());
		boolean s8=(this.getPurp()==other.getPurp());
		boolean s9=(this.getYellow()==other.getYellow());
		boolean s10=(this.getPnk()==other.getPnk());
		boolean s11=(this.getOrg()==other.getOrg());
		boolean s12=(this.getPos()==other.getPos());
		boolean s13=(this.getN_Ticket()==other.getN_Ticket());
		boolean s14=(Coupon==other.getCoupon());
		
		if(s1&&s2&&s3&&s4&&s5&&s6&&s7&&s8&&s9&&s10&&s11&&s12&&s13&&s14){
			return true;
		}else
			return false;
	}
	
	//compareTo()
	public int compareTo(Coupon_CTAStationj other){
		return this.getStation_Name().compareTo(other.getStation_Name());
	}
	
	//calcTotalTicketPrice()--override in super class(CTAStationj class)
		public double calcTotalTicketPrice(){
			return super.calcTotalTicketPrice()-Coupon;
		}
	
}
