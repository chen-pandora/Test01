package com.igeek;

import java.util.Random;
import java.util.Scanner;

/**
 * @author： Administrator
 * @Data： 2019年7月2日
 * @Description :随机产生一个1~100的数，进行猜测
 *
 */
public class Dmeo01 {
	public static void main(String[] args) {
		Random random=new Random();
		int number=random.nextInt(100)+1;
		int k=0;
		int key;
		Scanner sc=new Scanner(System.in);
		while(k==0){
			System.out.print("请输入： ");
			key=sc.nextInt();
			if(key>number){
				System.out.println("过大");
			}else if(key<number){
				System.out.println("过小");
			}else{
				System.out.println("正确");
				k+=1;
			}
		}
	}
}
