package TwoD_array;

import java.util.Scanner;

public class Rotate_90 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;++i) {                              //Transpose of a matrix
			for(int j=i;j<arr[0].length;++j) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		//Intechanging the column row by row
		int li=0;
		int ri=arr[0].length-1;
		for(int i=0;i<arr.length;++i) {
			while(li<ri) {
				int temp=arr[i][li];
				arr[i][li]=arr[i][ri];
				arr[i][ri]=temp;
				li++;
				ri--;
			}
		}
		
		//Printing array
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<arr[0].length;++j) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
