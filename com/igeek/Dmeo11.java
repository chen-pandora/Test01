package com.igeek;

/**
 * @author�� Administrator
 * @Data�� 2019��7��2��
 * @Description :���һ�����
 *
 */
public class Dmeo11 {
	public static void main(String[] args) {
		System.out.println(serach(12521));
	}
	public static boolean serach(int a) {
		int[] arr =new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i]=a%10;
			a=a/10;
		}
		Dmeo09.print(arr);
//		System.out.println(arr[4]);
		//if((a[0]==a[4])&&(a[1]==a[3]))
		return true;
	}
}
