package com.igeek;

import java.util.Scanner;

/**
 * @author Administrator
 * @Data 2019��7��1��
 * @Description :�ж���ż25
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������");
		int a=sc.nextInt();
		if(a%2==0){
			System.out.println("����Ϊż��");			
		}else{
			System.out.println("����Ϊ����");
		}
	}
}
