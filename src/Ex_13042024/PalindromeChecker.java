package Ex_13042024;

public class PalindromeChecker {
        public static void main(String[] args) {
            // Step 1: Define the string to check for palindrome
            String str = "jakarta"; // Example: "level"

            // Step 2: Initialize an empty string to store the reversed version of the original string
            String reversed = ""; // Example: ""

            // Step 3: Reverse the original string
            for (int i = str.length() - 1; i >= 0; i--) {
                // Get each character of the original string from end to start
                char ch = str.charAt(i); // Example: 'l'

                // Append each character to the reversed string
                reversed += ch; // Example: "l"
            }

            // Step 4: Check if the original string and reversed string are equal
            boolean isPalindrome = str.equals(reversed); // Example: true

            // Step 5: Display the result
            if (isPalindrome) {
                // If the original and reversed strings are equal, it's a palindrome
                System.out.printf("Yes, the word \"%s\" is a palindrome!",str); // Example: "Yes, it's a palindrome!"
            } else {
                // If the original and reversed strings are not equal, it's not a palindrome
                System.out.printf("No, the word \"%s\" is not a palindrome!",str); // Example: "No, it's not a palindrome!"
            }
        }
    }


