package stringPrograms;

public class CountLetterNumberSpecialChars {
	public static void main(String[] args) {
		String str = "Automat@1234io";
		int letterCount = 0;
		int numberCount = 0;
		int specialCount = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)) {
				letterCount++;
			}else if(Character.isDigit(ch)) {
				numberCount++;
			}else {
				specialCount++;
			}
		}
		System.out.println("letterCount= "+letterCount+" numberCount= "+numberCount+ " specialCount= "+specialCount);
	}
}
