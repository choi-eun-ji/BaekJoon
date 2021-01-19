package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int intnum = sc.nextInt();
		int num = 0;
		
		for(int k=0; k<intnum; k++){
			
			String str = sc.next();
			
			ArrayList<String> arr = new ArrayList<>();
			ArrayList<String> temp = new ArrayList<>();
			
			
			for(int i=0; i<str.length(); i++){
				arr.add(str.substring(i,i+1));
				
			}
			
			temp.add(arr.get(0));
			int cnt = 0;
			for(int i=1; i<arr.size(); i++)
			{
				if(arr.get(i).equals(arr.get(i-1))){
					for(int j=0; j<temp.size(); j++){
						if(temp.get(j).equals(arr.get(i))){
							
						}
					}
				}
				else{
					for(int j=0; j<temp.size(); j++){
						if(temp.get(j).equals(arr.get(i))){
							
						}
						else{
							cnt++;
						}
					}
					if(cnt > 0){
						temp.add(arr.get(i));
					}
				}
			}
			
			boolean flag = true;
			
			for(int i=0; i<temp.size(); i++){
				for(int j=i+1; j<temp.size(); j++){
					if(temp.get(i).equals(temp.get(j))){
						flag = false;
					}
				}
				
			}
			if(flag){
				num++;
			}
		}
		System.out.println(num);
		

	}

}
