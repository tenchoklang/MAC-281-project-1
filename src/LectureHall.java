//Author: Tenzin Choklang
//Date: 10/10/15
//MAC 281
//Program: Time Sorting
public class LectureHall {
	public static void main(String[] args)
    {
	double StartTime[]={09.00,09.30,09.50,10.00,10.10,10.30,10.15,10.30,10.45,10.55,11.00};
	double EndTime[]={09.45,10.30,10.15,10.30,10.25,10.55,10.45,11.00,11.30,11.25,11.15};
	
	int maxSize = 20;            // array size
    
	                
    CSorts refT_ST = new CSorts(maxSize);  // create the array
    
   for(int i=0;i<11;i++) //loop, insert value to method .insert
   {
    	refT_ST.insert(StartTime[i], EndTime[i]);
    }
    System.out.println("UNSORTED TIME");
	refT_ST.display();
	refT_ST.Odd_Even_Sort();             // odd_even sort them
	System.out.println();
    System.out.println("SORTED TIME");
	refT_ST.display();  
	System.out.println();
	refT_ST.TalkTime();
   
    }	
}
