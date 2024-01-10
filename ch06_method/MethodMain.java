package ch06_method;

import java.security.PublicKey;

import javax.imageio.event.IIOReadWarningListener;
import javax.print.attribute.standard.JobMessageFromOperator;

/**
 * Class Name   : MethodMain
 * Author       : YoungJu
 * Creatde Date : 2024. 1. 8.
 * Version      : 1.0
 * Purpose      : Method study
 * Desciption   : java의 함수 method
 */
public class MethodMain {

	public static void main(String[] args) {
		// method(메소드) 클래스나 객체에 종속된 함수
		// java는 모두 calss에 작성되기 때문에 함수를 메소드라 부름
		// 1~100 까지 더 하면 결과는?
		// 1~501 까지 더 하면 결과는?
		//30~60 까짖 더 하면 결과는?
		int sum = 0;
		for(int i =1; i <=100; i++) {
			sum +=i;
		}
		System.out.println(sum);
		// 메소드 실행
		printSum(1, 100);
		printSum(1, 50);
		printSum(30, 60);
		int res = returnSum(1, 30);
		System.out.println("리턴 받은 값 :" + res);
		// 메소드 생성
		// [접근제어자 static] 리턴타입 메소드명(파라미터){}
		print("hi");
		print(100);
		// '정수를 입력'받아 절대값을 '정수형으로 리턴'하는 메소드를 작성하시오!
		
		}
		public static void printSum(int from, int to) {
			int sum = 0;
			for(int i =from; i <=to; i++) {
				sum +=i;
			}
			System.out.printf("from : %d 부터 to : %d 까지 합은:%d \n",from,to,sum);
		}
		public static int returnSum(int from, int to) {
			int sum = 0;
			for(int i =from; i <=to; i++) {
				sum +=i;
			}
			return sum;
		}
		
		public static void print(String msg) {
			System.out.println(msg);
		}
		// 메소드 오버로딩 동일한 이름의 메소드를 다른 입력과, 리턴으로 정이할 수 있음.
		public static void print(int msg) {
			System.out.println(msg);
		}
		
		// '정수를 입력'받아 절대값을 '정수형으로 리턴'하는 메소드를 작성하시오!
		//1. input, output int (틀작성)
		//2. 0보다 작으면(음수) 면 *-1 (조건 및 실행문 작성)
		public static int MyAbs(int num) {
			
			if(num<0) {
				num *=-1;
			}
			return num;
		}

}
