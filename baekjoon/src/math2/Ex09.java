package math2;

import java.util.Scanner;
import java.lang.*;
public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		
		double re1 = r*r*Math.PI;
		
		double re2 = (r*2)*0.5*Math.sqrt(2);
		re2 = re2*re2;
		
		System.out.printf("%.6f\n",re1);
		System.out.printf("%.6f",re2);
	}

}
