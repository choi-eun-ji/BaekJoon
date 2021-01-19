package math1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int cnt = 0;
		int num = 1;
		while(true){
			
			num = num + (cnt*6);
			cnt++;
			
			if(num >= size){
				break;
			}
		}
		System.out.println(cnt);
		
	}

}
