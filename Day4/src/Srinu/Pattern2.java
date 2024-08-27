package Srinu;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int r=1,b=25;r<=4;r++) {
			for(int k=1;k<=b;k++) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {
			System.out.print(r+"   ");	
			}
			System.out.println();
			b=b-2;
	}

}}
