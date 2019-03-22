import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring variables

		String stringOne;
		String stringTwo;
		int sumUnicodeString1 = 0;
		int sumUnicodeString2 = 0;
		Scanner scnr = new Scanner(System.in);
		int lenghtString1;
		int lenghtString2;
		char unicodeString;
		int unicode;
		int i;
		int absoluteValue;

		// Getting input (strings)

		System.out.println("Please enter your first string: ");
		stringOne = scnr.next();
		System.out.println("Please enter your second string:");
		stringTwo = scnr.next();

		lenghtString1 = stringOne.length();
		lenghtString2 = stringTwo.length();

		for (i = 0; i < lenghtString1; ++i) {
			unicodeString = stringOne.charAt(i);
			unicode = (int) unicodeString;
			System.out.println("" + unicodeString + " : " + unicode);
			sumUnicodeString1 = sumUnicodeString1 + unicode;
		}

		for (i = 0; i < lenghtString2; ++i) {
			unicodeString = stringTwo.charAt(i);
			unicode = (int) unicodeString;
			System.out.println("" + unicodeString + " : " + unicode);
			sumUnicodeString2 = sumUnicodeString1 + unicode;
		}
//Calculating absolute value

		absoluteValue = Math.abs((sumUnicodeString1 - sumUnicodeString2));
		System.out.println("Absolute Value : " + absoluteValue);

	}
}
