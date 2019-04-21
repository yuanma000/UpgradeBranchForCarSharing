package Solution;
/*This class includes all the information in one CTAStation.
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:CTAStationj
*/

public class CTAStationj {
	//instance variable
	private int Stop_ID;
	private String Station_Name;
	private boolean ADA;
	private boolean Red;
	private boolean Blue;
	private boolean Green;
	private boolean Brn;
	private boolean Purp;
	private boolean Yellow;
	private boolean Pnk;
	private boolean Org;
	private Locationj pos;
	private int N_Ticket;
	public  final double Ticket_Price=2.25;
	
    //default constructor
	public CTAStationj( ){
		Stop_ID=1;
		Station_Name="18th";
		ADA=true;
		Red=false;
		Blue=false;
		Green=false;
		Brn=false;
		Purp=false;
		Yellow=false;
		Pnk=true;
		Org=false;
		pos=new Locationj();
		N_Ticket=2;
		
	}
	
	//nondefault constructor
	public CTAStationj(int Stop_ID, String Station_Name, boolean ADA, boolean Red, boolean Blue, boolean Green, boolean Brn, boolean Purp, boolean Yellow, boolean Pnk,boolean Org,Locationj pos, int N_ticket){
		this.Stop_ID=Stop_ID;
		this.Station_Name=Station_Name;
		this.ADA=ADA;
		this.Red=Red;
		this.Blue=Blue;
		this.Green=Green;
		this.Brn=Brn;
		this.Purp=Purp;
		this.Yellow=Yellow;
		this.Pnk=Pnk;
		this.Org=Org;
		this.pos=pos;
		this.N_Ticket=N_Ticket;
	}
	
	//mutator
	public void setStop_ID(int Stop_ID){
		this.Stop_ID=Stop_ID;
	}
	
	public void setStation_Name(String Station_Name){
		this.Station_Name=Station_Name;
	}
	
	public void setADA(boolean ADA){
		this.ADA=ADA;
	}
	
	public void setRed(boolean Red){
		this.Red=Red;
	}
	
	public void setBlue(boolean Blue){
		this.Blue=Blue;
	}
	
	public void setGreen(boolean Green){
		this.Green=Green;
	}
	
	public void setBrn(boolean Brn){
		this.Brn=Brn;
	}
	
	public void setPurp(boolean Purp){
		this.Purp=Purp;
	}
	
	public void setYellow(boolean Yellow){
		this.Yellow=Yellow;
	}
	
	public void setPnk(boolean Pnk){
		this.Pnk=Pnk;
	}
	
	public void setOrg(boolean Org){
		this.Org=Org;
	}
	
	public void setPos(Locationj pos){
		this.pos=pos;
	}
	
	
	public void setN_Ticket(int N_Ticket){
		this.N_Ticket=N_Ticket;
	}
	
	//accessor
	public int getStop_ID(){
		return Stop_ID;
	}
	
	public String getStation_Name(){
		return Station_Name;
	}
	
	public boolean getADA(){
		return ADA;
	}
	
	public boolean getRed(){
		return Red;
	}
	
	public boolean getBlue(){
		return Blue;
	}
	
	public boolean getGreen(){
		return Green;
	}
	
	public boolean getBrn(){
		return Brn;
	}
	
	public boolean getPurp(){
		return Purp;
	}
	
	public boolean getYellow(){
		return Yellow;
	}
	
	public boolean getPnk(){
		return Pnk;
	}
	
	public boolean getOrg(){
		return Org;
	}
	
	public Locationj getPos(){
		return pos;
	}
	
	public int getN_Ticket(){
		return N_Ticket;
	}
	
	//toString()
	public String toString(){
		return "Stop_ID: "+Stop_ID+"Station_Name: "+Station_Name+"ADA: "+ADA+"Red: "+Red+"Blue: "+Blue+"Green: "+Green+"Brn: "+Brn+"Purp: "+Purp+"Yellow: "+Yellow+"Pnk: "+Pnk
				+"Org: "+Org+pos.toString()+"N_Ticket: "+N_Ticket;
	}
	
	//equals()
	public boolean equals(CTAStationj other){
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
		
		if(s1&&s2&&s3&&s4&&s5&&s6&&s7&&s8&&s9&&s10&&s11&&s12&&s13){
			return true;
		}else
			return false;
	}
	
	//compareTo()
	public int compareTo(CTAStationj other){
		return Station_Name.compareTo(other.getStation_Name());
	}
	
	//calcTotalTicketPrice()
	public double calcTotalTicketPrice(){
		return Ticket_Price*N_Ticket;
	}
	
	
}
