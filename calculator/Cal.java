
package calculator;

public class Cal {
	//Addition 
	public int add(String s) {
		int sum=0;
		String s1[] =s.split(" ");
		for(String h:s1) {
			sum+=Integer.parseInt(h);;
		}
		return sum;
	}
	//Multiplication
	public int multiplication(String s) {
		int mul=1;
		String s1[] =s.split(" ");
		for(String h:s1) {
			mul*=Integer.parseInt(h);;
		}
		return mul;		
	}
	//Division
public int division(int dividend,int divisor) {
		
		return (dividend/divisor);
	}
	

}
