package math2;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int banbok = sc.nextInt();
		int result = 0;
		
		for(int p=0; p<banbok; p++){
			int num = sc.nextInt();
			int cnt = 0;
			
			boolean flag = true;
			if(num == 1){
				flag = false;
			}
			if(flag){
				for(int i=1; i<= 1000; i++){
					if(num % i==0){
						cnt++;
					}
				}
				if(cnt == 2){
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
