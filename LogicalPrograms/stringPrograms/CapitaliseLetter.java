package stringPrograms;

public class CapitaliseLetter {
	public static void main(String[] args) {
		String input = "my name is VaiBhav";
		// output str = "MY NAME IS vAIbHAV";

		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();
		StringBuilder resultUpperCaseEachLetter = new StringBuilder();

		// capitalize/uppercase each letter of string
		for (String word : words) {
			
			  if (word.length() > 0) {
			  
			  result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)
			  .toLowerCase()) .append(" ");
			  
			  result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)
			  .toLowerCase()).append(" ");
			  
			  }
			 
			// UpperCase all character where string has LowerCase chars
			// Code using advance for loop  
			  
				/*
				 * for(char ch :word.toCharArray()) { if(Character.isUpperCase(ch)) {
				 * result.append(Character.toLowerCase(ch)); }else if(Character.isLetter(ch)){
				 * result.append(Character.toUpperCase(ch)); } } result.append(" ");
				 */
		}
		
		
		System.out.println("First Char UpperCase string= " + result.toString().trim());

		// UpperCase all character where string has LowerCase chars

		for (int i = 0; i <= words.length - 1; i++) {

			char[] ch = words[i].toCharArray();
			for (int j = 0; j <= ch.length - 1; j++) {
				if (Character.isUpperCase(ch[j])) {
					resultUpperCaseEachLetter.append(Character.toLowerCase(ch[j]));
				} else if (Character.isLowerCase(ch[j])) {
					resultUpperCaseEachLetter.append(Character.toUpperCase(ch[j]));
				}
			}
			resultUpperCaseEachLetter.append(" ");
		}

		System.out.println("New String = " + resultUpperCaseEachLetter.toString().trim());

	}
}
