package Solution;
/*This program stands for eight greenline in Chicago CTA_Station.I instance eight object of
 * arraylist as redline,blueline,greenline,yellowline,brownline,purpleline,pinkline,orangline.
 * The user can add,delete,search one CTAStation in this eight lines, and we can sort all the ctastations
 * in each line.The user can also find the nearest station to location, and generate a route from start station
 * to final station, write output file, and recover from erroneous all kinds of inputs.
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:CTAMaincj
*/
public class CTAMaincj {

	public static void main(String[] args) {
		
		ReadFileAndRunTheMenuj object=new ReadFileAndRunTheMenuj();
		
		object.readFileAndselectChoice();
		
	}

}

