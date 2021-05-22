package TwoD_array;
import java.util.Scanner;

public class Two_d_array_demo {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int m=s.nextInt();
		int arr[][]=new int[n][m];
		
		for(int i=0;i<n;++i) {
			for(int j=0;j<m;++j) {
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;++i) {
			for(int j=0;j<m;++j) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
