package com.igeek;

/**
 * @author�� Administrator
 * @Data�� 2019��7��2��
 * @Description :��ȡ�����е���ֵ
 * ð������
 */
public class Dmeo04 {

	public static void main(String[] args) {
		int arr[]={12,98,45,73,60};
		int keymin=arr[0],keymax=arr[0]; 		//����һ������ֵ����keymin��keymax
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
		//bubbleSort ð������
		
		Dmeo04.bubbleSort(arr);
	}
	public static void bubbleSort(int arr[]) {
		//��ѭ��
		int key;
		for (int i = 0; i <=arr.length-1; i++)
		{
			//��ѭ��
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
