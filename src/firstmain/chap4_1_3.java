package firstmain;
import java.util.*;

public class chap4_1_3 {

	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		
		switch(month) {
		
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
			
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		
		default:
		case 12: case 1: case 2:
			System.out.println("겨울");
		}
	}

}

//switch 조건식 결과는 정수 또는 문자열
//case 값은 정수 상수만 가능, 중복 불가능