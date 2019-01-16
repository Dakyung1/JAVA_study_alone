package firstmain;
import java.util.*;

public class chap5_1 {
	public static void main(String[] args) {
		int[] iarr1 = new int[10];
		int[] iarr2 = new int[10];
		int[] iarr3 = new int[]{100,95,80,70,60}; // int[] iarr3 = {100,95,80,70,60}; 이렇게 써도됨
		char[] charr = {'a','b','c','d'};
		
		for(int i=0; i < iarr1.length; i++) {
			iarr1[i] = i+1; //1~10 숫자 순서대로 배열에 넣기
		}
		
		for(int i=0; i < iarr2.length; i++) {
			iarr2[i] = (int)(Math.random()*10) +1; //1~10의 값을 배열에 저장
		}
		
		//배열에 저장된 값들을 출력
		for(int i=0;i < iarr1.length; i++) {
			System.out.print(iarr1[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iarr2));
		System.out.println(Arrays.toString(iarr3));
		System.out.println(Arrays.toString(charr));
		System.out.println(iarr3);
		System.out.println(charr);
	}
}

/*타입[] 변수이름;
초기화까지 한 번에-> 타입[] 변수이름 = new 타입[길이];  int[] score = new int[5];
배열 초기화 -> int[] score = new int[]{50,60,70,80,90};
배열 길이->배열이름.length 

*/