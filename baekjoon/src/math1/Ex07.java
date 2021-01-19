package math1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		int[][] a = new int[15][15];
		
		for(int i=0; i<a.length; i++){
			a[0][i] = i;
		}
		
		for(int i=1; i<a.length; i++){
			for(int j=1; j<a[i].length; j++){
				int k=1;
				int sum = 0;
				while(k<=j){
					sum = sum + a[i-1][k];
					a[i][j] = sum;
					k++;
				}
			}
		}
		
		for(int i=0; i<tc; i++){
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			System.out.println(a[k][n]);
		}
	}

}
