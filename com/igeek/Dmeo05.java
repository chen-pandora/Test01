package com.igeek;

/**
 * @author： Administrator
 * @Data： 2019年7月2日
 * @Description :打印杨辉三角 
 */
public class Dmeo05 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] arr= new int[10][10];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(j>i){
					arr[i][j]=0;
					continue;
				}
				if(j==0){
					arr[i][j]=1;
					continue;
				}
				if(i==j){
					arr[i][j]=1;
					continue;
				}if(j<i){
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
					continue;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]==0)
					continue;
				System.out.print(String.format("%3d", arr[i][j])+ "  ");
			}
			System.out.println();
		}

	}

}
