package TwoD_array;

import java.util.Scanner;

public class State_of_wakanda_1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int r= s.nextInt();
		int c=s.nextInt();
		int arr1[][]=new int[r][c];
		
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				arr1[i][j]=s.nextInt();
			}
	}
		for(int j=0;j<arr1[0].length;++j) {
			if(j%2==0) {
				for(int i=0;i<r;++i) {
					System.out.print(arr1[i][j]+"->");
				}
				
			}
			else {
				for(int i=arr1.length-1;i>=0;--i) {
					System.out.print(arr1[i][j]+"->");
				}
				
			}
			
		}
}
}
