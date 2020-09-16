import java.util.ArrayList;
import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {
	    Scanner a = new Scanner(System.in);

	    int count = 0;
	    String ex = a.nextLine().toLowerCase();
	    for(int i = 0; i < ex.length(); ++i) {
	        if (ex.charAt(i) == 'a' || ex.charAt(i) == 'e' || ex.charAt(i) == 'i' ||
                    ex.charAt(i) == 'o' || ex.charAt(i) == 'u') count++;
        }

	    System.out.println("The vowels' count is " + count);
    }
}
