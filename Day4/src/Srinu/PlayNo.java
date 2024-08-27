package Srinu;

public class PlayNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num =99345,p=1,r,res=0;
     while(num!=0) {
    	 r=num % 10;
    	 if(r==3)
    	 { r=r+9  ;
    	 }
    	 res = res+ r*p;
    	 num =num/10;
    	 p=p*10;
    	 }
     System.out.println("result--->"+res);
     
	}

}
