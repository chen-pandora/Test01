package com.igeek;

/**
 * @author： Administrator
 * @Data： 2019年7月2日
 * @Description :
 *
 */
public class Dmeo12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] rb=new int[20];
		rb[0]=1;
		rb[1]=1;
		rb[2]=2;
		for(int i=3;i<20;i++){
			rb[i]=rb[i-1]+rb[i-2];
		}
		System.out.println(rb[19]);
		for (int i = 0; i < rb.length; i++) {
			System.out.print(rb[i]+" ");
		}
		System.out.println();
		Dmeo09.print(rb);
	}

}
