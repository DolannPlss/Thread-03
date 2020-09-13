package controller;

public class ThreadMatriz extends Thread{
	private int[] vt1 = new int[5] ;
	private int[] vt2 = new int[5] ;
	private int[] vt3 = new int[5] ;
	private int op;
	
	public ThreadMatriz(int[] vt1,int[] vt2,int[] vt3,int op){
		this.vt1=vt1;
		this.vt2=vt2;
		this.vt3=vt3;
		this.op=op;
		
	}
	
	public void run(){
		int res=0;
		for (int i = 0; i < 5; i++) {
			switch (op) {
			case 0:
				res = vt1[i]+res;
				break;
			case 1:
				res = vt2[i]+res;
				break;
			case 2:
				res = vt3[i]+res;
				break;

			}
		}
		System.out.println("valor da soma do vetor "+(op+1)+" = "+res);
	}
}
