package math1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fixnum = sc.nextInt();
		int renum = sc.nextInt();
		int price = sc.nextInt();
		
		int i=1;
		int count = 0;
		int cnt = 0;
		
		while(true){
			
			int sum1 = 0;
			int sum2 = 0;
			
			
			sum1 = fixnum + (renum*i);
			
			sum2 = price * i;
			
			if(sum2 > sum1){
				cnt++;
				count = i;
				break;
			}
			i++;
		}
		
		if(cnt > 0 ){
			System.out.println(count);
		}
		else{
			count = -1;
			System.out.println(count);
		}	
	}
}
