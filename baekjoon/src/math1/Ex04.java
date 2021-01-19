package math1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = 1;
		int i = 2;
		
		while(cnt < num){	
			cnt = cnt + i;
			i++;
		}
		
		int index = i-1;
		
		ArrayList<Integer> alist = new ArrayList<>();
		ArrayList<Integer> blist = new ArrayList<>();
		
		if(index % 2 == 0){
			for(int j=1; j<=index; j++){
				alist.add(j);
			}
			for(int j=index; j>=1; j--){
				blist.add(j);
			}
		}
		else{
			for(int j=index; j>=1; j--){
				alist.add(j);
			}
			for(int j=1; j<=index; j++){
				blist.add(j);
			}
		}

		index = num- (cnt-index);
		
	    System.out.println(alist.get(index-1)+"/"+blist.get(index-1));
		
	}
}
