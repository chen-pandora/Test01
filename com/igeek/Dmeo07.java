package com.igeek;

/**
 * @author： Administrator
 * @Data： 2019年7月2日
 * @Description :方法重载
 *
 */
public class Dmeo07 {
	public static void main(String[] args) {
		System.out.println(sum(12.5f,25.6f));
		System.out.println(sum(2,5,9));
	}
	public static float sum(float a,float b) {
		return a+b;
		
	}
	public static int  sum(int a,int b,int c) {
		return a+b+c;
		
	}
}
