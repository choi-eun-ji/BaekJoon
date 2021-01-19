package math2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int k=0; k<tc; k++){
			int num = sc.nextInt();
			
			boolean[] arr = new boolean[num+1];
			ArrayList<Integer> temp = new ArrayList<>();
			
			for(int i=2;i<=num; i++){
				if(arr[i]==true){
					continue;
				}
				else{
					for(int j=i+i;j<=num; j+=i){
						arr[j]=true;
					}
				}
			}
			int min = 99999;
			int a=0, b = 0;
			for(int i=2;i<= num; i++){
				if(arr[i]== false){
					temp.add(i);
				}
			}
			
			for(int i=0; i<temp.size(); i++){
				for(int j=0; j<temp.size(); j++){
					if(temp.get(i)+temp.get(j) == num && min>Math.abs(temp.get(i)-temp.get(j))){
						min = Math.abs(temp.get(i)-temp.get(j));
						a = temp.get(i);
						b = temp.get(j);
					}
				}
			}
			//for(int i=2;i<=num; i++){
				//for(int j=2; j<=num; j++){
					//if(arr[i]==false && arr[j]==false){
						//if(i+j == num && min>Math.abs(i-j)){
							//	min = Math.abs(i-j);
								//a = i;
								//b = j;
						//}
					//}
				//}
		//	}
			System.out.println(a+" "+b);
		}
	}
}
