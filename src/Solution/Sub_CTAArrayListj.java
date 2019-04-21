package Solution;
/*This class is a child class of CTA_ArrayListj class. This class has additional sequential search, binary search, select sort,bubble sort 
 * insertion sort to one CTA Route.
* @author:Jingting Chen
* @cwid:A20344697
* @course:cs201
* @sec.#:SB 112F
* @date:12/3/2015
* @name of program:Sub_CTA_ArrayListj
*/

public class Sub_CTAArrayListj extends CTA_ArrayListj{
	
	//sequential search
	public int seqSearch(String stop_name){
		for(int i=0; i<getIndex();i++){
			if(stop_name.equals(getElement(i).getStation_Name())){
				System.out.println("The seqsearch is successful");
				return i;
			}
		}
		System.out.println("The seqsearch is unsuccessful");
		return -1;
		
	}
	
	//binary search
	public int binSearch(String stop_name){
		int start=0;
		int last=getIndex();
		int middle=0;
		while(start<=last){
			middle=(start+last)/2;
			if(getElement(middle).getStation_Name().equals(stop_name)){
				System.out.println("The binsearch is successful");
				return middle;
			}else if(getElement(middle).getStation_Name().compareTo(stop_name)<0){
				start=middle+1;
			}else{
				last=middle-1;
			}
		}
		System.out.println("The binsearch is unsuccessful");
		return -1;
	}
	
	
		
	//select sort()
	public void selectSort(){
		
		for(int i=0; i<getIndex(); i++){
			
			int min=i;
			for(int j=i+1; j<getIndex();j++){
				
				if(getElement(j).getStop_ID()<(getElement(min).getStop_ID())){
 					min=j;
 				 }
				
			}
				if(min!=i){
					//swap 
					swap(i,min);
			}
			
	   }
	}
	
	//bubble Sort()
	public void bubbleSort(){
     
        int n = copyArray().length;

           
        for(int i=1; i<n; i++){
            if(getElement(i-1).getStop_ID()>getElement(i).getStop_ID()){
                CTAStationj temp = getElement(i-1);
                setElement(getElement(i),i-1);
                setElement(temp,i);   
            }
        }   
	}
	
	//insertion Sort()
	public void insertionSort(){
		
        for(int i=1; i<getIndex(); i++){
            int j=i;
            while(j>0 && (getElement(j-1).getStop_ID()>getElement(j).getStop_ID())){
            	CTAStationj temp = getElement(j-1);
                setElement(getElement(j),j-1);
                setElement(temp,j);
                j--;
               
            }
        }  
	}
	
}
