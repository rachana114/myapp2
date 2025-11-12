import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for accurate comparison
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;

        int left = 0;
        int right = processed.length() - 1;

        while
