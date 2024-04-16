package Ex_13042024;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Step 1: Define the string to check for palindrome
        String str = "level"; // Example: "level"

        // Step 2: Initialize an empty string to store the reversed version of the original string
        String reversed = ""; // Example: ""

        // Step 3: Reverse the original string
        for (int i = str.length() - 1; i >= 0; i--) {
            // Get each character of the original string from end to start
            // Explanation for str.length():
            // The method str.length() returns the length of the string str, which is the number of characters in the string.
            // Example: For the string "level", str.length() returns 5, as there are 5 characters in the string.
            char ch = str.charAt(i); // Example: 'l' for the first iteration
            // The method charAt(i) retrieves the character at the specified index i in the string str

            // Append each character to the reversed string
            reversed += ch; // Example: "l" for the first iteration
        }



        // Step 4: Check if the original string and reversed string are equal
        boolean isPalindrome = str.equals(reversed); // Example: true

        // Step 5: Display the result
        if (isPalindrome) {
            // If the original and reversed strings are equal, it's a palindrome
            System.out.printf("Yes, the given word \"%s\" is a palindrome!",str); // Example: "Yes, it's a palindrome!"
        } else {
            // If the original and reversed strings are not equal, it's not a palindrome
            System.out.printf("No, the given word \"%s\" is not a palindrome!",str); // Example: "No, it's not a palindrome!"
        }
    }
}
