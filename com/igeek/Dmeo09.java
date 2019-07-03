package com.igeek;

/**
 * @author： Administrator
 * @Data： 2019年7月2日
 * @Description :
 * 取最值
 * 求和
 * 遍历数组
 */
public class Dmeo09 {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		Dmeo09.getnum(arr);
		Dmeo09.print(arr);
		Dmeo09.sum(arr);
	}
	//取最值
	public static void getnum(int arr[]) {
		int keymin=arr[0],keymax=arr[0]; 		//将第一个数组值赋予keymin、keymax
		for (int i = 1; i < arr.length; i++) {
			while(arr[i]>keymax){
				keymax=arr[i];
			}
			while(arr[i]<keymin){
				keymin=arr[i];
			}
		}
		System.out.println("MAX is " + keymax);
		System.out.println("MIN is " + keymin);
	}
	//遍历数组
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//求和
	public static int sum(int arr[]) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		return sum;
	}
}
