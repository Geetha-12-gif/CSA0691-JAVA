class StringPalindromeChecker extends Thread {
    private String str;

    public StringPalindromeChecker(String str) {
        this.str = str;
    }


    public void run() {
        if (isPalindrome(str)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class NumberPalindromeChecker extends Thread {
    private int number;

    public NumberPalindromeChecker(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (isPalindrome(number)) {
            System.out.println("The number " + number + " is a palindrome.");
        } else {
            System.out.println("The number " + number + " is not a palindrome.");
        }
    }

    private boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}

public class R1921107188 {
    public static void main(String[] args) {
        String testString = "MADAM";
        int testNumber = 121;

        
        StringPalindromeChecker stringChecker = new StringPalindromeChecker(testString);
        stringChecker.start();

               NumberPalindromeChecker numberChecker = new NumberPalindromeChecker(testNumber);
        numberChecker.start();
    }
}