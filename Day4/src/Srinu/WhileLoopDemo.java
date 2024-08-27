package Srinu;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		do {
			int j=1;
			while(j<=10) {
				System.out.println(i + "*" + j+"="+j*i);// 2 * 1 = 2
				j++;
			}
			i++;
		}while(i<=5);
	}

}
