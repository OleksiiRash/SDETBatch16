package class13.homowork_class13;

public class Task2 {

    public static void main(String[] args) {

/*
Task2С17:
How would you check if String is palindrome or not? aba=> true
Abbc => false
*/

        String palindrome = "abA";
        // Palindromes are strings that read the same backwards as forwards, regardless of letter case.
        palindrome = palindrome.toLowerCase();
        StringBuilder str = new StringBuilder(palindrome);
        str.reverse();
        String newPalindrome = str.toString();
        if (palindrome.equals(newPalindrome)) {
            boolean check = true;
            System.out.println(check);
        } else {
            System.out.println("false");
        }



    }
}
