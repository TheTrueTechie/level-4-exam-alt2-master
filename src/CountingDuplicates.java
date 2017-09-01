import java.util.Scanner;

public class CountingDuplicates {
	public static int duplicateCount(String word) {
		char letter; 
		int lengthOfWord = 0; 
		int amountOfRepeatedWords = 0; 
		lengthOfWord = word.length(); 
		for (int i = 0; i < word.length(); i++) {
			letter = word.charAt(i);
			if (letter==word.charAt(i) || letter==word.charAt(i+1)) {
				amountOfRepeatedWords++; 
				
			}
		}
		return amountOfRepeatedWords;
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				final String nextLine = scanner.nextLine();
				if (nextLine.trim().isEmpty()) break;
				
				System.out.println(duplicateCount(nextLine));
			}
		}
	}
}
