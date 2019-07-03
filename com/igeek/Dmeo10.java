package com.igeek;

import java.util.Scanner;

/**
 * @author： Administrator
 * @Data： 2019年7月2日
 * @Description :查找季节
 *
 */
public class Dmeo10 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("输入一个月份：");
			int month=sc.nextInt();
			
			switch (month) {
			//case穿透现象
			case 1:
			case 2:
			case 12:
				System.out.println("冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			default:
				System.out.println("输入错误");
				break;
			}
		}
}
