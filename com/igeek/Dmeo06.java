package com.igeek;

/**
 * @author�� Administrator
 * @Data�� 2019��7��2��
 * @Description :�ҳ����ֵ
 *
 */
public class Dmeo06 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
