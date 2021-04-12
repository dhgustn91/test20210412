package practice.pkg;

import java.util.Scanner;

public class Practicezz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int res;
        res = 0;
        System.out.print("숫자를 입력 : ");
		res = scan.nextInt();
		   if(res>0) {
		   if((res%5)==0 && (res%3)==0) {
				  System.out.println("공배수");
			  }else if((res%3)==0) {
				  System.out.println("3의 배수");
			  }else if((res%5)==0) {
				  System.out.println("5의 배수");
			  }else if((res%5)>0 && (res%3)>0){
				  System.out.println("둘다 아님");
			  }
		   }else {
			   System.out.println("양수를 입력해야함");
		   }
		}
		
	
	
	
	}


