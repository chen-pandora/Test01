package com.igeek;

/**
 * @author�� Administrator
 * @Data�� 2019��7��2��
 * @Description :�Ƚ�Ԫ��
 *
 */
public class Dmeo08 {
	public static void main(String[] args) {
		System.out.println(compare((byte)10,(byte)2));
	}
	public static boolean compare(byte a,byte b) {
		System.out.println("byte :");
		return a==b;
	}
	public static boolean compare(int a,int b) {
		System.out.println("int :");
		return a==b;
	}
	public static boolean compare(short a,short b) {
		System.out.println("short :");
		return a==b;
	}
	public static boolean compare(long a,long b) {
		System.out.println("long :");
		return a==b;
	}
	
}
