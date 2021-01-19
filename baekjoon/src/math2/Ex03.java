package math2;

import java.util.*;

//실행 시간 : 2.374
public class Ex03 {

	public static void main(String[] args) {
		
		// 실행시간 측정 코드
		long s = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);
		
		// 정수의 최소값과 최대값을 입력받는다.
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		//int cnt = 0;
		boolean flag = false;
		
		// j가 최솟값부터 시작해서 최댓값까지의 범위를 지정해준다. 
		for(int j=start; j<=end; j++){
			flag = false;
			//cnt = 0;
			// 최소값을 1부터 시작해서 해당 최소값까지 %를 진행하여 나머지가 0이되는 순간을 count하고, 
			for(int i=2; i<j; i++){
				if(j%i == 0){
					flag = true;
					break;
				}
			}
			
			// 그 count가 2가되는 순간 해당 수는 소수로 판별하여 출력을 도와준다.
			if(flag == false){
				System.out.println(j);
			}
		}
		
		long e = System.currentTimeMillis();

		System.out.println( "실행 시간 : " + ( e - s )/1000.0 );

		// 하지만 해당 코드는 시간복잡도가 증가하게 된다.
		// 따라서 다른 방법을 시도해야 한다.
		// 문제 : 내생각에는 이중 for문을 사용해서 그런것 같음
		// 해결 : 이중 for문을 사용하지 않고 코드를 짜야한다.
		
		// 입력값 : 3 ~ 16
		
	}
}
