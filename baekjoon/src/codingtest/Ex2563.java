package codingtest;

import java.util.Scanner;

public class Ex2563 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int cnt= 0;
		boolean[][] arr = new boolean[101][101];
		
		for(int i=0; i<size; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j= x; j<x+10; j++){
				for(int k=y; k<y+10; k++){
					if(arr[j][k]==true){
						continue;
					}
					
					arr[j][k] = true;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
