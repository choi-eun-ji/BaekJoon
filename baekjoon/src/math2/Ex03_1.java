package math2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		boolean[] arr = new boolean[end+1];
		
		// 소수가 아니면 = true 소수이면 = false
		arr[0] = true;
		arr[1] = true;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]){
				continue;
			}
			else{
				for(int j=i+i; j<arr.length; j+=i){
					arr[j] = true;
				}
			}
		}

		for(int i=start; i<arr.length; i++){
			if(arr[i]==false){
				System.out.println(i);
			}
		}
		
	}
}
