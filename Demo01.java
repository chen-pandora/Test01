package com.igeek;

import java.util.Scanner;

/**
 * @author Administrator
 * @Data 2019年7月1日
 * @Description :判断奇偶25
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入");
		int a=sc.nextInt();
		if(a%2==0){
			System.out.println("输入为偶数");			
		}else{
			System.out.println("输入为奇数");
		}
	}
}
