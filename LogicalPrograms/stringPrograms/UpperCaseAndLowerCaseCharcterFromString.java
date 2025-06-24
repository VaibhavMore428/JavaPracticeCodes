package stringPrograms;

public class UpperCaseAndLowerCaseCharcterFromString {
	public static void main(String[] args) {
		String str = "Sio-_P@Nf]]sdfsfE1";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				System.out.println("Lowercase elements= " + ch);
			} else if (Character.isUpperCase(ch)) {
				System.out.println("Uppercase elements= " + ch);
			}
		}

		// Using Ascii values
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if (ch >= 65 && ch <= 91) {
				System.out.println("Uppercase= " + ch);
			} else if (ch > 92 && ch < 97) {
				System.out.println("Special charcter= " + ch);
			} else if (ch >= 97 && ch <= 122) {
				System.out.println("LowerCase= " + ch);
			}
		}

		for (int k = 0; k < str.length(); k++) {
			char ch = str.charAt(k);
			if (ch >= 'a' && ch <= 'z') {
				System.out.println("Lowercase characters= " + ch);
			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.println("Uppercase Characters= " + ch);
			} else if (!(ch >= '0' && ch <= '9')) {
				System.out.println("Special characters= " + ch);
			}
		}

	}
}
