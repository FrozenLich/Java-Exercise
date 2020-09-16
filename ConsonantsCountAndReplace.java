import java.util.ArrayList;
import java.util.Scanner;

public class ConsonantsCountAndReplace {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int count = 0;
        String ex = a.nextLine();
        ex = ex.replaceAll("([^aeiouAEIOU\\W])", "*");
        for(int i = 0; i < ex.length(); ++i) {
            count = ex.charAt(i) == '*' ? count+1 : count;
        }

        System.out.println("The consonants' count is " + count);
        System.out.println("The replaced String is " + ex);
    }
}
