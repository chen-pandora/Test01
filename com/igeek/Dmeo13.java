package com.igeek;

import java.util.Random;

/**
 * 
 * @author： Administrator
 * @Data： 2019年7月2日
 * @Description :七个1~100的数去掉最大与最小 求均值
 *
 */
public class Dmeo13 {
	public static void main(String[] args) {
		Random ra=new Random();
		int[] arr=new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ra.nextInt(100)+1;
		}
		Dmeo09.print(arr);
		int sum=Dmeo09.sum(arr);
		int max=Dmeo13.getmax(arr);
		int min=Dmeo13.getmin(arr);
		double ave=(sum-min-max)/5.0;
		System.out.println(ave);
	}
	public static int getmax(int arr[]) {
		int key=0;
		for (int i = 0; i < arr.length; i++) {
			if(key<arr[i]){
				key=arr[i];
			}
		}
		return key;
	}
	public static int getmin(int arr[]) {
		int key=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(key>arr[i]){
				key=arr[i];
			}
		}
		return key;
	}
}
