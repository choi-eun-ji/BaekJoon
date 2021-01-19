package math1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++){
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			int person = sc.nextInt();
			
			int mok = person / h;
			int na = person % h;
			String str = "";
			if(na == 0){
				if(mok<10){
					str = "0"+mok;
				}
				else{
					str = Integer.toString(mok);
				}
				str = h+str;
			}
			else{
				mok = mok+1;
				if(mok < 10){
					str = "0"+mok;
				}
				else{
					str = Integer.toString(mok);
				}
				str = na + str;
			}
			System.out.println(str);
		}
	}

}
