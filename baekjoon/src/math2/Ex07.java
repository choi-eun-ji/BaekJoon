package math2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		
		for(int i=0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
			arr2[i] = sc.nextInt();
		}
		
		int num = arr1[0];
		int num2 = arr2[0];
		int result1 = 0;
		int result2 = 0;
		int cnt=0;
		int cnt2=0;
		for(int i=1; i<arr1.length; i++){
			if(arr1[i]==num){
				cnt++;
				arr1[i] = 1000;
			}
			if(arr2[i]==num2){
				cnt2++;
				arr2[i] = 1000;
			}
		}
		if(cnt == 0){
			result1=num;
		}
		else{
			for(int i=0; i<arr1.length; i++){
				if(arr1[i]!=1000){
					result1 = arr1[i];
				}
			}
		}
		
		if(cnt2 == 0){
			result2 = num2;
		}
		else{
			for(int i=0; i<arr2.length; i++){
				if(arr2[i]!=1000){
					result2 = arr2[i];
				}
			}
		}
		
		System.out.println(result1 + " " +result2);
	}

}
