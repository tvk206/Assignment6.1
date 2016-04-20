
public class Calculator {
	public static int getSum (int [] num) {
		int sum = 0;
		for (int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}

	public static double getSum (double [] num) {
		int sum = 0;
		for (int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}
	
	public static int getAvg (int [] num) {
		int sum = 0;
		for (int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		return sum/num.length;
	}
	
	public static int getProd (int [] num) {
		int prod = 1;
		for (int i=0; i<num.length; i++) {
			prod*=num[i];
		}
		return prod;
	}
	
	public  static  int getFact (int [] num) {
		
		for (int i=0; i<num.length; i++) {
			int fact = 1;
			 for (int j = 1; j <= num[i]; j++) {
				fact = fact * j;
		}	
			System.out.println(fact);	
	}
		return 0;	
	}
}
