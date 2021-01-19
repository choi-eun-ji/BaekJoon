package math1;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 0;
		
		int moc = num / 5;
		int nam = num % 5;
		
		if(moc == 0){
			nam = num % 3;
			if(nam != 0){
				result = -1;
			}
			else{
				result = num / 3;
			}
		}
		else{
			if(nam % 3 == 0){
				result = (nam /3) + moc;
			}
			else{
				int cnt = 0;
				int num2 = 0;
				if(moc - 1 != 0){
				while(moc - 1 != 0){
					num2 = num - (5*(moc - 1));
					if(num2 % 3 == 0){
						result = (moc-1) + (num2/3);
						cnt++;
						break;
					}
					moc--;
				}
				if(cnt == 0){
					if(num % 3 ==0){
						result = num / 3;
					}
					else{
						result = -1;
					}
				}
				}
				else{
					if(num % 3 == 0){
						result = num / 3;
					}
					else{
						result = -1;
					}
				
				}
			}
		
		}
		
		System.out.println(result);
	}
}
