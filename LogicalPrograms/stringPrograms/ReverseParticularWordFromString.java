package stringPrograms;

public class ReverseParticularWordFromString {
	public static void main(String[] args) {

		String inputString = "My name is Vaibhav More";
		System.out.println("Input String= " + inputString);
		String reverseWord = "Vaibhav";
		String NewreverseWord = "name";

		String result = "";
		String[] wordArray = inputString.split(" ");
		// Approch 1
		StringBuilder resultstring = new StringBuilder();
		for (int j = 0; j < wordArray.length; j++) {
			String currentWord = wordArray[j];
			if (currentWord.equals(reverseWord)) {
				for (int i = 0; i < reverseWord.length(); i++) {
					result = reverseWord.charAt(i) + result;
				}
				resultstring.append(result).append(" ");

			} else {
				resultstring.append(currentWord).append(" ");
			}
		}

		StringBuilder NewresultString = new StringBuilder();

		for (String str : wordArray) {
			if (str.equals(NewreverseWord)) {
				System.out.println(str);

				String rev = new StringBuilder(str).reverse().toString();
				NewresultString.append(rev).append(" ");
			} else {
				NewresultString.append(str).append(" ");
			}
		}

		/*
		 * StringBuilder resultstring = new StringBuilder(); for(String str : wordArray)
		 * { resultstring.append(str+" "); }
		 */

		System.out.println("Output String= " + resultstring + " \nNewresultString=  " + NewresultString);
	}
	// Approch 2
	/*
	 * ArrayList<String> arraylist = new ArrayList<String>(); for (String c :
	 * wordArray) { arraylist.add(c); } String result = reverseWord(reverseWord);
	 * String output = setResultString(arraylist, result, reverseWord);
	 * System.out.println("Output:= " + output); }
	 * 
	 * public static String reverseWord(String reverseWord) { String output = "";
	 * for (int i = reverseWord.length() - 1; i >= 0; i--) { output = output +
	 * reverseWord.charAt(i); } return output; }
	 * 
	 * private static String setResultString(ArrayList<String> arraylist, String
	 * result, String reverseWord) {
	 * 
	 * int index = arraylist.indexOf(reverseWord); arraylist.set(index, result);
	 * return String.join(" ", arraylist); }
	 */

}
