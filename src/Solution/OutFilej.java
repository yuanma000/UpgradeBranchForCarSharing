package Solution;
/*This class includes a outPutFile method. This method can output data to a txt file.
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:OutFilej
*/
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutFilej {
	//write out put file
	public void outPutFile(Sub_CTAArrayListj objArr){
		try{
			CTAStationj stop;
			PrintWriter out=null;
			out=new PrintWriter(new FileWriter("src\\Jingting\\Chen_outFile.txt"));
			
			objArr.reset();
			while(objArr.hasNext()){
				stop=objArr.getNext();
				out.println(stop.toString());
			}
			out.close();
		}catch(IOException e){
			System.err.println("IOExcetpion is :"+e.getMessage());
		}
	}
}
