package TwoD_array;

import java.util.Scanner;

public class Saddle_price {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
	    int arr[][]=new int[n][n];
		
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				arr[i][j]=s.nextInt();
			}
		}
		
		  
		int maxce=Integer.MIN_VALUE;                          //find min element in the row and keep the column at which that min. element is present inside the variable.
		int minre=Integer.MAX_VALUE;                          // now for that particular column find the max. element in that column. and compare with the minimum element 
		int posc=0;                                            // if it is equal then print the element.
		
		
		for(int i=0;i<arr.length;++i) {
			
			for(int j=0;j<arr[0].length;++j) {
				if(arr[i][j]<=minre) {
					minre=arr[i][j];
					posc=j;
				}
			}
			
			for(int k=0;k<arr.length;++k) {
				if(arr[k][posc]>=maxce) {
					maxce=arr[k][posc];
					}
			}
			
			
			if(minre==maxce) {
				System.out.println(minre);
				break;
			}else {
				minre=Integer.MAX_VALUE;
				maxce=Integer.MIN_VALUE;
			}
			
		 }
		
	}

}
