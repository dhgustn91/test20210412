package practice.pkg;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
	 Scanner scan = new Scanner(System.in);
	 int res;
	 String str = "";
	System.out.print("점수를 입력하세요 : ");
	 res = scan.nextInt();
	 if(res <= 100) {
	     if(res >= 95) {
			 str = "당신의 학점은 A+입니다.";
		 }else if(res >= 90) {
			 str = "당신의 학점은 A입니다.";
		 }else if(res >= 85) {
			 str = "당신의 학점은 B+입니다."; 
		 }else if(res >= 80) {
			 str = "당신의 학점은 B입니다.";
		 }else if(res < 80) {
			 str = "당신의 학점은 F입니다.";
		 }
         System.out.println(str);
	 }else {
		 System.out.println("입력 범위 초과");
	 }
	}
}
//95~100:A+, 90~94:A, 85~89:B+, 80~84:B, 79이하:F
