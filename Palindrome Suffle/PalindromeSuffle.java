import java.util.*;

class PalindromeSuffle {
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        in.close();
        int length = word.length();
        char c[] = word.toCharArray();
        Arrays.sort(c);
        char[] palinWord = new char[length];
        int cntF = 0;
        int cntB = length - 1;
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                palinWord[cntF] = c[i];
                cntF++;
            } else {
                palinWord[cntB] = c[i];
                cntB--;
            }
        }
        System.out.println(palinWord);
    }
}
