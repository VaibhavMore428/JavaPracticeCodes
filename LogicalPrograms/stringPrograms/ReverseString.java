package stringPrograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input string =");
		String input = sc.nextLine();
		String output = reverse(input);
		System.out.println("Output Strig= " + output);
	}

	private static String reverse(String input) {
		// TODO Auto-generated method stub
		String result = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			result = result + input.charAt(i);
		}
		return result;
	}
}
