package TwoD_array;

import java.util.Scanner;

public class Multiplication_of_2d_array {
public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n1= s.nextInt();
		int m1=s.nextInt();
		int arr1[][]=new int[n1][m1];
		
		for(int i=0;i<n1;++i) {
			for(int j=0;j<m1;++j) {
				arr1[i][j]=s.nextInt();
			}
		}
		
		
		int n2= s.nextInt();
		int m2=s.nextInt();
		int arr2[][]=new int[n2][m2];
		
		for(int i=0;i<n2;++i) {
			for(int j=0;j<m2;++j) {
				arr2[i][j]=s.nextInt();
			}
		}
		
		if(m1!=n2) {
			System.out.println(" Invalid Input");
		}else {
			
			int prod[][]=new int[n1][m2];
			for(int i=0;i<n1;++i) {
				for(int j=0;j<m2;++j) {
					for(int k=0;k<m1;++k) {
						prod[i][j]+=arr1[i][k]*arr2[k][j];
					}
				}
			}
			for(int k=0;k<prod.length;++k) {
				for(int m=0;m<prod[0].length;++m) {
					System.out.print(prod[k][m]+" ");
				}
				System.out.println();
			}
		}
}

}
