package practice.pkg;

import java.util.Scanner;

public class Practicezz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int res;
        res = 0;
        System.out.print("���ڸ� �Է� : ");
		res = scan.nextInt();
		   if(res>0) {
		   if((res%5)==0 && (res%3)==0) {
				  System.out.println("�����");
			  }else if((res%3)==0) {
				  System.out.println("3�� ���");
			  }else if((res%5)==0) {
				  System.out.println("5�� ���");
			  }else if((res%5)>0 && (res%3)>0){
				  System.out.println("�Ѵ� �ƴ�");
			  }
		   }else {
			   System.out.println("����� �Է��ؾ���");
		   }
		}
		
	
	
	
	}


