package operators;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String num =(a%2==0)?"even":"odd";
		System.out.println(num);

	}

}
