package practice.pkg;

import java.util.Scanner;

public class Praticed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int res;
		res = 0;
		System.out.print("���� �Է� : ");
		res = scan.nextInt();
		if(res>0) {
			if(res % 2 == 1) {
				System.out.println("Ȧ��");
			}else if(res % 2 == 0) {
				System.out.println("¦��");
			}
		}else {
			System.out.println("����� �Է� �� ��");
		}
		
	}
}