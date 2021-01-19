package math1;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int v = sc.nextInt();
		
		int num = a - b;
		int cnt = 0;
		if((v-b)%num == 0){
			cnt = (v-b) / num;
		}
		else{
			cnt = (v-b) / num;
			cnt = cnt +1;
		}
		System.out.println(cnt);

	}

}
