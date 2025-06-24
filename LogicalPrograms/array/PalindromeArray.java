package array;

public class PalindromeArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1 };

		if (isPalindrome(arr)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

	public static boolean isPalindrome(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			if (arr[i] == arr[n - i - 1]) {
				return true;
			}
		}
		return false;
	}
}

/*
 	Logic Divide the array two parts.
  	Check 1st element to last element
 */