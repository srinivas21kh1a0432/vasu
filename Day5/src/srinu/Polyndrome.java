package srinu;

public class Polyndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "1221";
		// abba
		String res = "";
		for(int i=data.length()-1;i>=0;i--) {
			res = res + data.charAt(i);
		}
		if(data.equalsIgnoreCase(res) == true) {
			System.out.println("Yes ..It is Polyndrome");
		}
		else {
			System.out.println("Not");
	}

}}
