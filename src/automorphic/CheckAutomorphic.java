package automorphic;

public class CheckAutomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAutomorphic1();
	}

	static void checkAutomorphic() {
		int val = 25;
		int sqroot = 0;
		int newVal = 0;
		while (val != 0) {
			sqroot = (int) Math.pow(val, 2);
			int lastDigit = sqroot % 10;
			int secondDigit = (sqroot / 10) % 10;
			newVal = secondDigit * 10 + lastDigit;
			break;

		}
		System.out.println(newVal == val);
		System.out.println(newVal == val ? "Automorphic" : "Not a Automorphic");

	}

	static void checkAutomorphic1() {
		int val = 25;
		int sqroot = 0;
		int newVal = 0;
		while (val != 0) {
			sqroot = (int) Math.pow(val, 2);
			newVal = sqroot % 100;
			break;

		}
		System.out.println(newVal == val);
		System.out.println(newVal == val ? "Automorphic" : "Not a Automorphic");

	}

}
