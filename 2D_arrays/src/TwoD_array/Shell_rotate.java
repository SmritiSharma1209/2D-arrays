package TwoD_array;

import java.util.Scanner;

public class Shell_rotate {

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
		
		int S=s.nextInt();
		int r=s.nextInt();
		
		rotateShell(arr,S,r);
		display(arr);
				
		}
	
	
public static void rotateShell(int arr[][], int S, int r) {
		int oned[]=fillOnedFromShell(arr, S);
		rotate(oned,r);
		fillShellfromOned(arr,oned,S);
	}
	
	
	public static int[] fillOnedFromShell(int arr[][], int S) {
		int minr=S-1;
		int minc=S-1;
		int maxr=arr.length-S;
		int maxc=arr[0].length-S;
		
		
		//total size of the array the no. of the elements present at the walls lw+bw+rw+tw.   lw==rw and bw==tw
		int sz= 2*(maxr-minr+1) + 2*(maxc-minc+1) -4;     
		int Oned[]=new int[sz];
		int indx=0;
		
		//lw
		for(int i=minr ,j=minc; i<=maxr; ++i) {
			Oned[indx]=arr[i][j];
			indx++;
		}
		minc++;
		
		//bw
		for(int j=minc, i=maxr; j<=maxc;++j) {
			Oned[indx]=arr[i][j];
			indx++;
		}
		maxr--;
		
		
		//rw
		for(int i=maxr,j=maxc; i>=minr;i--) {
			Oned[indx]=arr[i][j];
			indx++;
		}
		maxc--;
		
		
		//tw
		for(int j=maxc,i=minr;j>=minc;--j) {
			Oned[indx]=arr[i][j];
			indx++;
		}
		
		return Oned;
		
}
	
	public static void fillShellfromOned(int arr[][], int Oned[], int S) {
		int minr=S-1;
		int minc=S-1;
		int maxr=arr.length-S;
		int maxc=arr[0].length-S;
		int indx=0;
		
		
		//lw
		for(int i=minr ,j=minc; i<=maxr; ++i) {
			Oned[indx]=arr[i][j];
			indx++;
		}
		minc++;
		
		//bw
		for(int j=minc, i=maxr; j<=maxc;++j) {
			Oned[indx]=arr[i][j];
			indx++;
		}
		maxr--;
		
		
		//rw
		for(int i=maxr,j=maxc; i>=minr;i--) {
			Oned[indx]=arr[i][j];
			indx++;
		}
		maxc--;
		
		
		//tw
		for(int j=maxc,i=minr;j>=minc;--j) {
			Oned[indx]=arr[i][j];
			indx++;
		}
		
		
	}
	
	public static void rotate(int oned[], int r) {
		if(r<0) {
			r=r+oned.length;
		}
		r=r % oned.length;
		
		reverse(oned, 0, oned.length-r-1);
		reverse(oned, oned.length-r, oned.length-1);
		reverse(oned, 0, oned.length-1);
		
     }
	
	public static void reverse(int oned[], int li, int ri) {
		
		while(li<ri) {
			int temp=oned[li];
			oned[li]=oned[ri];
			oned[ri]=temp;
			
			li++;
			ri--;
		}
		
	}
	
    public static void display(int arr[][]) {
    	for(int i=0;i<arr.length;++i) {
    		for(int j=0;j<arr[0].length;++j) {
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
}
