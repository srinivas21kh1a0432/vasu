package Srinu;
import java.util.Scanner;
public class RoundofNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner sc = new Scanner(System.in);
			System.out.println("enter float value");
			float num = sc.nextFloat();
			
			int m = (int)(num * 10000);// 1.566666 * 1000--- 1566
			int ld = m % 10;// 1566 % 10---- 6
			m = m /10;// 1566 / 10---156
			if(ld > 5) m++;// 157---
			num = m/1000.0f;// 157/100
			
			System.out.println("res---->"+num);
		
	}

}
