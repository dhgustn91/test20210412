package practice.pkg;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
	 Scanner scan = new Scanner(System.in);
	 int res;
	 String str = "";
	System.out.print("������ �Է��ϼ��� : ");
	 res = scan.nextInt();
	 if(res <= 100) {
	     if(res >= 95) {
			 str = "����� ������ A+�Դϴ�.";
		 }else if(res >= 90) {
			 str = "����� ������ A�Դϴ�.";
		 }else if(res >= 85) {
			 str = "����� ������ B+�Դϴ�."; 
		 }else if(res >= 80) {
			 str = "����� ������ B�Դϴ�.";
		 }else if(res < 80) {
			 str = "����� ������ F�Դϴ�.";
		 }
         System.out.println(str);
	 }else {
		 System.out.println("�Է� ���� �ʰ�");
	 }
	}
}
//95~100:A+, 90~94:A, 85~89:B+, 80~84:B, 79����:F
