/*
 1. AB + BA = 99 �� �����ϴ� ��� A�� B�� ������ ���ϴ� ���α׷��� �ۼ��ϼ���
 */

package firstmain;

public class bit0316_1 {

	public static void main(String[] args) {
		
		for(int a =0; a<10; a++) {
			for(int b=0; b<10;b++) {
				int r1 = (a *10) + b;
				int r2 = (b*10) + a;
				
				if(r1 + r2 == 99) {
					 System.out.printf("A�� %d�̰�, B�� %d�̴�.%n",r1, r2);
				}
				
			}
		}
	}
}
