import java.util.Scanner;

public class WordsCount {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int length = 0;

        String ex = a.nextLine().strip();
        ex = ex.replaceAll("\\s+", "");
        length = ex.length();

        System.out.println("The words count is " + length);
    }
}
