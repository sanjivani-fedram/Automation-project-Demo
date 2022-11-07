package LogicalProgarm;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Armstrong number = Addition of qube present in number
		
		int orgNum = 4324;
		
		int sum = 0;
		
		for(int i=orgNum;i>0;i++) {
			int rem = i%10;
			sum = sum +(rem*rem*rem);
		}
		if(sum==orgNum) {
			System.out.println(orgNum + "is Armstrong");
		}
		else
			System.out.println(orgNum + "is not Armstrong");
	}
	

}
