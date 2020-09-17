import javax.print.DocFlavor;
import java.util.Scanner;

public class CountAndReplace {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int SEndingcount = 0;
        int YEndingcount = 0;
        String ex = a.nextLine().replaceAll("\\s+", " ").strip();
        boolean firstS = true;
        boolean firstY = true;
        int firstSpos = -1;
        int firstYpos = -1;

        String[] wordsList = ex.split(" ");

        String lastWord = wordsList[wordsList.length-1];
        int splitPoint = lastWord.length() - 1;
        for(int z = lastWord.length() - 1; z >= 0; z--) {
            if (Character.isAlphabetic(lastWord.charAt(z)) || Character.isDigit(lastWord.charAt(z))) {
                splitPoint = z;
                break;
            }
        }

        wordsList[wordsList.length - 1] = lastWord.substring(0, splitPoint);
        String specChars = lastWord.substring(splitPoint);

        if (ex.length() != 0) {
            for (int i = 0; i < wordsList.length; i++) {
                if (wordsList[i].charAt(wordsList[i].length() - 1) == 's') {
                    SEndingcount++;
                    if (firstS) {
                        firstSpos = i;
                        firstS = false;
                    }
                }

                if (wordsList[i].charAt(wordsList[i].length() - 1) == 'y') {
                    YEndingcount++;
                    if (firstY) {
                        firstYpos = i;
                        firstY = false;
                    }
                }
            }
        }

        if (!firstS && !firstY) {
            String temp = wordsList[firstSpos];
            wordsList[firstSpos] = wordsList[firstYpos];
            wordsList[firstYpos] = temp;
        }

        StringBuilder sb = new StringBuilder();
        if(ex.length() != 0) {
            String one = wordsList[0];
            one = one.substring(0, 1).toUpperCase() + one.substring(1);
            sb.append(one);
            sb.append(" ");
        }

        for(int j = 1; j < wordsList.length; j++) {
            String trailing = wordsList[j];
            trailing = trailing.substring(0,1).toLowerCase() + trailing.substring(1);
            sb.append(trailing);
            sb.append(" ");
        }

        System.out.println("The count of words ending with 's' is " + SEndingcount);
        System.out.println("The count of words ending with 'y' is " + YEndingcount);
        System.out.println("The String after replacement is as follows:");
        System.out.println(sb.toString().strip() + specChars);


    }
}
