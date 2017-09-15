public class CSorts{

	   private double[] S_T;   
	   private double[] E_T; // ref to array a
	   private int nElems;               // number of data items
	//--------------------------------------------------------------
	   public CSorts(int max)          // constructor
	      {
	      S_T = new double[max];   
	      E_T = new double[max];  
	      nElems = 0;                        // no items yet
	      }
	//--------------------------------------------------------------
	   public void insert(double value, double value2)    // put element into array
	      {
	      S_T[nElems] = value;      
	      E_T[nElems] = value2;// insert it
	      nElems++;                      // increment size
	      }
	//--------------------------------------------------------------
	 
	   public void display()             // displays array contents
	      {
		 
	      for(int j=0; j<nElems; j++)       // for each element,
	         System.out.print(S_T[j] + "-" + E_T[j] + "   ");  // display it
	     
	      
	      }
		
	//--------------------------------------------------------------
	
	   public void Odd_Even_Sort()
	      {
	      //change E_T to S_T to sort Start Times
		   //change S_T to E_T to sort end times
		for(int mainLoop=0;mainLoop<nElems;mainLoop++)
		{
	     
			//Odd+=2 to skip the even, the odd number of swaps will aways be equal to or great then the even swaps
			if(nElems%2==0)//if statement to work with when nElems is even
			 {
			for(int odd=0; odd<nElems;odd+=2)//odd+=2 to skip the even numbers; 
			{
	               if(E_T[odd]>E_T[odd+1])
	               {  
	            	   swap(odd,odd+1);
	               }
			 }
			 }
			 else//when nElems is not even we subtract 1 from it 
				 for(int odd=0; odd<nElems-1;odd+=2) // for odd swaps  
				 {
		               if(E_T[odd]>E_T[odd+1])
		               {  
		            	   swap(odd,odd+1);
		               }
				  }
				 
	             if(nElems%2==0)//if statement to work with when nElems is even
	             {
	               for(int even=1; even<nElems-1;even+=2) //even+=2 to skip the odd numbers; loops nElems/2 times 
	               {
	                   if(E_T[even]>E_T[even+1])
	                   {  
	                	   swap(even,even+1);
	                   }     
	               }
	             }
	             else//when nElems is not even we subtract 1 from it 
	            	 for(int even=1; even<nElems;even+=2)  //loops nElems-1/2 times, for even swaps 
	            	 {
	                     if(E_T[even]>E_T[even+1])
	                     {  
	                  	   swap(even,even+1);
	                     }     
	                 }
	            	 
		}
	      }  // end Odd_Even Sort()
	   public void Duration(){
		   for(int i=0;i<nElems;i++)
		   {
			   double duration =E_T[i]-S_T[i];
			   
			   
				   System.out.println("time "+i+ " duration) " + duration);
			 
				   
		   }
		   
	   }
	   
	   public void TalkTime()
	   {
		   
		 int ST=1;
		 int ET=0;
		 System.out.println("talk "+ 0 +")" + S_T[0]+" -  " + E_T[0]+" YES");
		   for(int i=1;i<nElems;i++)
		   {
			   if(E_T[ET]<=S_T[ST])
			   {
				   System.out.println("talk "+ ST +")" + S_T[ST]+" -  " + E_T[ST]+" YES");
				  
				  
				   ET=ST;//counter for array E_T to move up ST space when the if statement is true
				   ST++;//counter for array S_T, always 1 space or greater then ET, so we can compare starttime and endtime 
			   }
			   else
			   {
				   System.out.println("talk "+ ST +")" + S_T[ST]+" -  " + E_T[ST]+" NO");
			   ST++;//increment so we can compare the end time to a different start time, ET stays the same
			   }
		   }
	   }
	//--------------------------------------------------------------
	   private void swap(int one, int two)
	      {
	      double temp = S_T[one];
	      S_T[one] = S_T[two];
	      S_T[two] = temp;
	      
	      double temp2 =E_T[one];// this is to swap the endtime corresponding with start time when the start time is swapped
	      E_T[one]=E_T[two];
	      E_T[two]= temp2;
	      }
	//--------------------------------------------------------------
	    

	//--------------------------------------------------------------
} 