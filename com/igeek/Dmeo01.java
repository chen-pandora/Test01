package com.igeek;

import java.util.Random;
import java.util.Scanner;

/**
 * @author�� Administrator
 * @Data�� 2019��7��2��
 * @Description :�������һ��1~100���������в²�
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
			System.out.print("�����룺 ");
			key=sc.nextInt();
			if(key>number){
				System.out.println("����");
			}else if(key<number){
				System.out.println("��С");
			}else{
				System.out.println("��ȷ");
				k+=1;
			}
		}
	}
}
