package Solution;
/*This class is a location. the location includes Latitude and Longitude.
 * The CTAStationj class has a Locationj class.
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:Locationj
*/

public class Locationj {
	//instance variable;
	private double Lat;
	private double Lon;
	
	//default constructor
	public Locationj(){
		Lat=41.857908;
	    Lon=-87.669147;
	}
	
	//nondefault constructor
	public Locationj(double Lat,double Lon){
		this.Lat=Lat;
		this.Lon=Lon;
	}
	
	//mutator
	public void setLat(double Lat){
		this.Lat=Lat;
	}
	
	public void setLon(double Lon){
		this.Lon=Lon;
	}
	
	//accessor
	public double getLat(){
		return Lat;
	}
	
	public double getLon(){
		return Lon;
	}
	
	//toString()
	public String toString(){
		return "Latitude: "+Lat+"Longitude: "+Lon;
	}
	
	//equals()
	public boolean equals(Locationj other){
		boolean s1=(Lat==other.getLat());
		boolean s2=(Lon==other.getLon());
		if(s1&&s2){
			return true;
		}else
			return false;
	}
	
	
	//calcDistance()
	public double calcDistance(double Lat, double Lon){
		return Math.sqrt(Math.pow(this.Lat-Lat,2)+Math.pow(this.Lon-Lon,2));
	}
}
