import java.util.Scanner;

public class WordsCount {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int length = 0;

        String ex = a.nextLine().strip();
        String[] wordsList = ex.split(" ");

        if(ex.length() == 0)
            System.out.println("The words count is 0");
        else
            System.out.println("The words count is " + wordsList.length);
    }
}
