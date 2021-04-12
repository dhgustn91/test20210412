package practice.pkg;

import java.util.Scanner;

public class Zzz {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int res;
		 String grade = "";
		 System.out.print("점수를 입력하세요 : ");
		 res  = scan.nextInt();
		 if(100>=res) {
			 
		 if(100>=res && 90<=res) {
			 grade = "A";
		 }else if(90>res && 80<res) {
			 grade = "B";
		 }else if(80>res && 70<res) {
			 grade = "C";
		 }else if(70>res && 60<res) {
			 grade = "D";
		 }else if(60>res) {
			 grade = "F";
		 }
		 System.out.println(grade);
		 
		 }else {
			 System.out.println("다시 입력하세요");
		 }			 
		 }
	}



