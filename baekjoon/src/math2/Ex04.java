package math2;

import java.util.Scanner;

// 에라토스테네스의 체를 사용한 문제
public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true){
			int num = sc.nextInt();
			
			if(num == 0) break;
			int result = 0;
			boolean arr[] = new boolean[2*num+1];
			
			// 11 ~20
			arr[0] = true;
			for(int i=2; i<=(2*num); i++){
				if(arr[i]==true){
					continue;
				}
				else{
					for(int j = i+i; j<=(2*num); j+=i){
						arr[j]=true;
					}
				}
			}
			
			for(int i= num+1; i<=(2*num); i++){
				if(arr[i]==false){
					result++;
				}
			}
			System.out.println(result);

		}
		
	}

}
