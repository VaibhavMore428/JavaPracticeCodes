package numberRealatedprograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 121;
		int originalNumber = number;
		int reversnumber = 0;

		while (number > 0) {
			int lastDigit = number % 10;
			reversnumber = reversnumber * 10 + lastDigit;
			number = number / 10;
		}
		if (originalNumber == reversnumber) {
			System.out.println(originalNumber + " is a Palindrome Number.");
		} else {
			System.out.println(originalNumber + " is Not a Palindrome Number.");
		}
	}
}
