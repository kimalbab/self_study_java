package com.codeUp.june.practice;

import java.util.Scanner;

public class Day4_0601_CodeUp_1031 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//수 입력받기
		int num = sc.nextInt();
		String ocNum = Integer.toOctalString(num);
		System.out.println(ocNum);
	}

}
