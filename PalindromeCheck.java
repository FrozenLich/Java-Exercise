import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);

        boolean check = true;
        String ex = b.nextLine().toLowerCase();
        ex = ex.replaceAll("[^a-zA-Z0-9]+", "");
        int first = 0;
        int last = ex.length() - 1;
        while(first < last) {
            if (ex.charAt(first) != ex.charAt(last)) {
                check = false;
                break;
            }

            first++;
            last--;
        }
        if(check)
            System.out.println("This String is a Palindrome");
        else
            System.out.println("This String is not a Palindrome");
    }
}
