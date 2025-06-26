package stringPrograms;

public class ReverserWordsfromString {
	public static void main(String[] args) {
		String str = "I am good";
		// output = good am i
		String[] words = str.split(" ");
		StringBuilder resultString = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			resultString.append(words[i] + " ");
		}
		System.out.println(resultString);
	}
}
