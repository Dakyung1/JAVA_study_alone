package firstmain;
import java.util.*;

public class chap2_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n", num);

	}
}