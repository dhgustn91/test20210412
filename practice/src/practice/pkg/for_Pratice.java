package practice.pkg;

import java.util.Scanner;

public class for_Pratice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int sum;

		System.out.print("입력 : ");
		n = scan.nextInt();
		for (int i = 1; i <= 9; i++) {
			sum = n * i;
			if (n < 10) {
				System.out.println(n + " * " + i + " = " + sum);
			} else {
				System.out.println("9단 초과");
				break;
			}
		}

	}

}
