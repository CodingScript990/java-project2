package com.likelion.week1.day4;

import com.likelion.project2.PrintHello;

public class DefineAVariable {
		public static void main(String[] args) {
				int iVal; // Variable 선언
				iVal = 0;// 초기화는 최초로 값을 지정하는 것을 말함

				//System.out.println(iVal);// 초기화 안해서 Error 남

				// Output(iVal)
				System.out.println(iVal);

				PrintHello printHello; // Type(참조, 멤버)variable 선언
				//printHello.print(); // 초기화 안해서 Error 남
				printHello = new PrintHello(); // new 를 이용하여 인스턴스화 및 초기화를 말함

				// Output(PrintHello)
				printHello.print();
		}
}
