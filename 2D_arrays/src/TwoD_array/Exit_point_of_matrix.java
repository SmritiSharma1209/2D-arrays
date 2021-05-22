package TwoD_array;

import java.util.Scanner;

public class Exit_point_of_matrix {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int r= s.nextInt();
		int c=s.nextInt();
		int arr[][]=new int[r][c];          //directionwise print karenge
		int k=0;
		
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				arr[i][j]=s.nextInt();
			}
	}
		int dir=0;   //0---e, 1--s, 2--w, 3--n
		int i=0;    //yeh initial values se enter kar raha hai
		int j=0;
		
		while(true) {
			dir=(dir+arr[i][j])%4;
			if(dir==0) {              //east move kar raha hai
				j++;
			}
			else if(dir==1) {         // south move kar raha hai
				i++;
			}
			else if(dir==2) {           //west move kar raha hai
				j--;
			}
			else if(dir==3) {          //north move kar raha hai
				i--;
			}
			
			if(i<0) {
				i++;
				break;
				
			}
			else if(j<0){
				j++;
				break;
				
			}
			else if(i==arr.length) {
				i--;
				break;
				
			}
			else if(j==arr[0].length) {
				j--;
				break;
				
			}
		}
		System.out.println(i);
		System.out.println(j);
	}

}
