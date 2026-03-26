package demo1;
import java.util.Scanner;

public class NumberInWords {
		    private static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", 
		                                           "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

		    public static String convertToWords(int num) {
		        if (num < 0 || num > 99999) {
		            return "Number out of range";
		        }

		        String result = "";

		        if (num >= 1000) {
		            result += convertThreeDigit(num / 1000) + " Thousand ";
		            num %= 1000;
		        }

		        result += convertThreeDigit(num);

		        return result.trim();
		    }

		    private static String convertThreeDigit(int num) {
		        String words = "";

		        if (num >= 100) {
		            words += ones[num / 100] + " Hundred ";
		            num %= 100;
		        }

		        if (num >= 10 && num < 20) {
		            words += teens[num - 10];
		        } else {
		            words += tens[num / 10];
		            if (num % 10 != 0) {
		                words += " " + ones[num % 10];
		            }
		        }

		        return words.trim();
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number (up to 99999): ");
		        int num = scanner.nextInt();
		        scanner.close();
		        System.out.println(convertToWords(num));
		    }
	}

