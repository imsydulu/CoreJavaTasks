package armstrong;

public class ArmstrongNumber {

	public static void main(String[] args) {
			armStrongNum();
	}

	static void armStrongNum() {
		int val = 153;
		int sum = 0;
		int digits = String.valueOf(val).length();
		int gval = val;
		while (val != 0) {
			
			int last = val % 10;

			sum = (int) (sum + Math.pow(last, digits));
			val = val / 10;

		}
		System.out.println(sum == gval ? gval+" is a armstrong number" : " is not a armstrong");

	}

}
