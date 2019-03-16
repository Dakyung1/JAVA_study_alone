/*
 1. AB + BA = 99 를 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하세요
 */

package firstmain;

public class bit0316_1 {

	public static void main(String[] args) {
		
		for(int a =0; a<10; a++) {
			for(int b=0; b<10;b++) {
				int r1 = (a *10) + b;
				int r2 = (b*10) + a;
				
				if(r1 + r2 == 99) {
					 System.out.printf("A는 %d이고, B는 %d이다.%n",r1, r2);
				}
				
			}
		}
	}
}
