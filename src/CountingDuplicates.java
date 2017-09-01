import java.util.Scanner;

public class CountingDuplicates {
	public static int duplicateCount(String word) {
		return 0;
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
