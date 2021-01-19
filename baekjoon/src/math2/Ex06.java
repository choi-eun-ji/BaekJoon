package math2;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		// x는 1보다 크거나 같은 자연수고 y도 1보다 크거나 같은 자연수
		
		int min = 2000;
	
		int[] arr = new int[4];
		
		arr[0] = w-x;
		arr[1] = x;
		arr[2] = h-y;
		arr[3] = y;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println(min);
		
	}

}
