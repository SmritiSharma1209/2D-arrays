package TwoD_array;

import java.util.Scanner;

public class State_of_wakanda_2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int r= s.nextInt();
		int c=s.nextInt();
		int arr[][]=new int[r][c];
		
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				arr[i][j]=s.nextInt();
			}
		}
		
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		while(minc<=maxc) {
		for(int i=minr; i<=maxr;++i) {
			int j=minc+i;
			System.out.print(arr[i][j] +" -> ");
			
		}
		minc++;
		maxr--;

	}
		
	}

}
