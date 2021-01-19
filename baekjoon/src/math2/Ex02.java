package math2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		int result = 0;
		int sum=0;
		int min = 100000;
		boolean flag = false;
		
		for(int i=a; i<=b; i++){
			cnt = 0;
			for(int j=1; j<=b; j++){
				if(i%j == 0){
					cnt++;
				}
			}
			if(cnt == 2){
				flag = true;
				sum += i;
				result++;
				if(i < min){
					min = i;
				}
			}
		}
		if(flag == false){
			sum = -1;
			System.out.println(sum);
		}
		else{
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
