package main;

import controller.ThreadMatriz;

public class Principal {
	public static void main(String[] args) {
		int[][] m= new int [3][5];
		int[]vt1= new int [5];
		int[]vt2= new int [5];
		int[]vt3= new int [5];
		for (int L = 0; L < 3; L++) {
			for (int C = 0; C < 5; C++) {
				m[L][C]=(int) (Math.random()*101);
			}
		}
		for (int L = 0; L < 3; L++) {
			for (int C = 0; C < 5; C++) {
				if(L==0){
					vt1[C]=m[L][C];
				}else if(L==1){
					vt2[C]=m[L][C];
				}else if(L==2){
					vt3[C]=m[L][C];
				}
			}
		}
		for (int op= 0; op < 3; op++) {
			Thread ThreadMatriz = new ThreadMatriz(vt1, vt2, vt3, op);
			ThreadMatriz.start();
		}
	}
}
