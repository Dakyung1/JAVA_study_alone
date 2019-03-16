/*
 2. 선택정렬을 이용해서 배열의 오름차순으로 정렬하는 메서드와
   내림차순으로 정렬하는 메서드를 만들고 사용해보세요
 */
package firstmain;

import java.util.Scanner;

public class bit0316_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] resultl = new int[5];
		resultl = InputArray(scan);
		printArray(scan, AscArray(resultl));
		System.out.println();
		printArray(scan, DesArray(resultl));
		
	}
	
	//입력 메서드
	public static int[] InputArray(Scanner scan) {
		int[] inputnum = new int[5];
		for(int i =0; i<5; i++) {
			System.out.print("정수를 입력하세요: ");
			inputnum[i] = scan.nextInt();
		}
		return inputnum;
	}
	
	//오름차순
	public static int[] AscArray(int[] inputnum) {
		int a =0;
		for(int k=0; k<4;k++) {
			if(inputnum[k] > inputnum[k+1]) {
				a = inputnum[k+1];  
				inputnum[k+1] = inputnum[k];
				inputnum[k] =a ;
			}
		}
		return inputnum;
	}
	
	//내림차순
	public static int[] DesArray(int[] inputnum) {
		int a =0;
		for(int k=0; k<4;k++) {
			if(inputnum[k] < inputnum[k+1]) {
				a = inputnum[k+1];  
				inputnum[k+1] = inputnum[k];
				inputnum[k] =a ;
			}
		}
		return inputnum;
	}
	
	//프린트
	public static void printArray(Scanner scan, int[] inputnum) {
		for(int i =0; i<5; i++) {
			System.out.print(inputnum[i]);
		}
	}

}
