package com.igeek;

/**
 * @author： Administrator
 * @Data： 2019年7月2日
 * @Description :找出最大值
 *
 */
public class Dmeo06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(getmax(5,8));

	}
	public static int getmax(int a,int b) {
		int max=0;
		if(a>b){
			max= a;
		}else{
			max= b;
		}
		return max;
		
	}

}
