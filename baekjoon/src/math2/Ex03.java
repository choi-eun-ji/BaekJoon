package math2;

import java.util.*;

//���� �ð� : 2.374
public class Ex03 {

	public static void main(String[] args) {
		
		// ����ð� ���� �ڵ�
		long s = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);
		
		// ������ �ּҰ��� �ִ밪�� �Է¹޴´�.
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		//int cnt = 0;
		boolean flag = false;
		
		// j�� �ּڰ����� �����ؼ� �ִ񰪱����� ������ �������ش�. 
		for(int j=start; j<=end; j++){
			flag = false;
			//cnt = 0;
			// �ּҰ��� 1���� �����ؼ� �ش� �ּҰ����� %�� �����Ͽ� �������� 0�̵Ǵ� ������ count�ϰ�, 
			for(int i=2; i<j; i++){
				if(j%i == 0){
					flag = true;
					break;
				}
			}
			
			// �� count�� 2���Ǵ� ���� �ش� ���� �Ҽ��� �Ǻ��Ͽ� ����� �����ش�.
			if(flag == false){
				System.out.println(j);
			}
		}
		
		long e = System.currentTimeMillis();

		System.out.println( "���� �ð� : " + ( e - s )/1000.0 );

		// ������ �ش� �ڵ�� �ð����⵵�� �����ϰ� �ȴ�.
		// ���� �ٸ� ����� �õ��ؾ� �Ѵ�.
		// ���� : ���������� ���� for���� ����ؼ� �׷��� ����
		// �ذ� : ���� for���� ������� �ʰ� �ڵ带 ¥���Ѵ�.
		
		// �Է°� : 3 ~ 16
		
	}
}
