package TwoD_array;

import java.util.Scanner;

public class Search_in_sorted_array {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
	    int arr[][]=new int[n][n];
		
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				arr[i][j]=s.nextInt();
			}
		}
		
		  int data=s.nextInt();
		  
		  int i=0;                               //rightmost corner se compare kara ..agar element bada hai toh neeche jayenge agar element chota hai toh left jayenge
		  int j=arr[0].length-1;
		  
		  
		  while(i<arr.length && j>=0) {
			 
			  if(data==arr[i][j]) {
		    	  System.out.println(i);
		    	  System.out.println(j);
		    	  return;
		      }
	      
			  else if(data>arr[i][j]) {
	    	  i++;
	         }
	           else {
	    	  j--;
	      }
	      
	 }
		  System.out.println(" Element not found");
	      
	}

}
