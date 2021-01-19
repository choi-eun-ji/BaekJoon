package math2;

import java.util.*;
import java.lang.*;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			ArrayList<Integer> list = new ArrayList<>();
			
			list.add(sc.nextInt());  
			list.add(sc.nextInt());  
			list.add(sc.nextInt());  
			
			if(list.get(0)==0 && list.get(1)==0 && list.get(2)==0){
				break;
			}
			
			int max = -1;
			for(int i=0; i<list.size(); i++){
				if(max < list.get(i)){
					max = list.get(i);
				}
			}
			for(int i=0; i<list.size(); i++){
				if(max == list.get(i)){
					list.remove(i);
				}
			}
			
			int a = list.get(0);
			int b = list.get(1);
			
			
			a = (int) Math.pow(a, 2);
			b = (int) Math.pow(b, 2);
	
			int result = 0;
			result = a+b;
			
			if(result == (int) Math.pow(max, 2)){
				System.out.println("right");
			}
			else{
				System.out.println("wrong");
			}
		}
	}
}
