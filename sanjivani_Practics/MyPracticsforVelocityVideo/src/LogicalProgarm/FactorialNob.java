package LogicalProgarm;

public class FactorialNob {

	public static void main(String[] args) {
		int num = 5;
		int fact = 4;
		
		for(int i = num;i>=fact;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
	

}
