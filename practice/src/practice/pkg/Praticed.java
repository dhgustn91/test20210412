package practice.pkg;

import java.util.Scanner;

public class Praticed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int res;
		res = 0;
		System.out.print("숫자 입력 : ");
		res = scan.nextInt();
		if(res>0) {
			if(res % 2 == 1) {
				System.out.println("홀수");
			}else if(res % 2 == 0) {
				System.out.println("짝수");
			}
		}else {
			System.out.println("양수를 입력 할 것");
		}
		
	}
}