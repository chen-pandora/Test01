package com.igeek;

/**
 * @author： Administrator
 * @Data： 2019年7月2日
 * @Description :获取数组中的最值
 * 冒泡排序
 */
public class Dmeo04 {

	public static void main(String[] args) {
		int arr[]={12,98,45,73,60};
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
		//bubbleSort 冒泡排序
		
		Dmeo04.bubbleSort(arr);
	}
	public static void bubbleSort(int arr[]) {
		//外循环
		int key;
		for (int i = 0; i <=arr.length-1; i++)
		{
			//内循环
			for (int j = 0; j <arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					key=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=key;
				}
				for (int j2 = 0; j2 <=arr.length-1; j2++)
				{
					System.out.print(arr[j2] +" ");
				}
				System.out.println();
			}
		}
	}

}
