package Solution;
/*This class includes all the information in One CTA Route. This class includes add, delete one station to one CTA Route.
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:CTA_ArrayListj
*/

public class CTA_ArrayListj {
	
	//instance variable
    final int MAX_SIZE=1000;
	
	private CTAStationj[] Array;
	private int index;
	private int iterator;
	
	//default constructor
	public CTA_ArrayListj (){
		Array=new CTAStationj[MAX_SIZE];
	}
	
	//nondefault constructor
	public CTA_ArrayListj (int size){
		Array= new CTAStationj[size];
	}
	
	//get length of an array
	public int getLength(){
		
		return	Array.length;
	}
	
	public CTAStationj[] copyArray(){
		CTAStationj[] copied_array = new CTAStationj[index];
		for(int i = 0; i<index; i++){
			copied_array[i] = Array[i];
		}
		return copied_array;
	}
	
	public void setArray(CTAStationj[] strArray){
		for(int i = 0; i<strArray.length; i++){
			Array[i] = strArray[i];
		}

	}
	
	public int getIndex(){
		
		return index;
	}
	
	public void setIndex(int an_Index){
		index=an_Index;
	}
	
	public CTAStationj getElement(int pos){
		
		return Array[pos];
	}
	
	public void setElement(CTAStationj stop, int pos){
		 Array[pos]=stop;
	}
	
	public  String toString(){
		String sum="";
		for(int i=0; i<getIndex(); i++){
			sum+=Array[i]+"\n";
			sum+=" ";
		}
		return sum;
	}
	
	public boolean equals(CTA_ArrayListj objArray){
		//same_length ?		
		if (objArray.getLength() == Array.length){
		}	
		else
			return false;	
		//same_index ?				
		if (index == objArray.getIndex()){
		}	
		else
			return false;
		// same_elements ?
		for(int i = 0; i<objArray.getLength(); i++){
			if (Array[i] != objArray.getElement(i))
				return false;
		}		
		return true;

	}
	
	//store an element in the array
	public void add(CTAStationj Element){
		Array[index]=Element;
		index++;
	}
	
	//insert an element in the array
	public void insert(CTAStationj stop, int pos){
		if (pos > Array.length)
		{
			System.out.println("The position is out of scope!");
		}
		else if(pos<index){
			for(int i=(index-1); i>pos; i--){
				Array[i]=Array[i-1];
			}
		    Array[pos]=stop;
		    index++;
		}
	}
	
	//deletes an element at the specified position in the array
	public void delete(int pos){
		if (pos > Array.length)
		{
			System.out.println("The position is out of range!");
		}else if(pos<index){
			for(int i=pos; i<index;i++){
				Array[i]=Array[i+1];
			}
			index--;
		}
	}
	
	//iterates through array to find aStr in any of the data
	public int isContained(String station_name){
	
		for(int i=0; i<index; i++){
			if(Array[i].getStation_Name().contains(station_name)){
				return i;
			}else{
			}	
		}
		return -1;
	}
	
	//swap()
	public void swap(int i, int j){
		if(i<index&&j<index){
			CTAStationj temp=Array[i];
			Array[i]=Array[j];
			Array[j]=temp;
		}else{
			System.out.println("The pos is beyond the range");
		}
	}
	
	//reset()
	public void reset(){
		iterator=0;
	}
	
	//if there is more data in this array , it returns true
	public boolean hasNext(){
		if(iterator<index){
			return true;
		}else
			return false;
	}
	
	//return the iterator points to the object
	public CTAStationj getNext(){
		if(iterator>=index){
			System.out.println("No more data now.");
			return null;
		}else{
			iterator++;
			return Array[iterator-1];
		}
	}
}
