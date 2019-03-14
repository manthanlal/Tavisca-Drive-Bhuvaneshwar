/*
No String libraries are to be used to silve this question.
Q. Take an input string and shuffle to form a palindrome.
    (The given string is definitely an anagram of a palindrome)
*/
import java.util.*;

class PalindromeShuffle {
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        in.close();
        int length = word.length();
        char[] c = word.toCharArray();
        Arrays.sort(c);
        int t = 0;
        char d[] = new char[length];
        for (int i = word.length() - 1; i >= 0; i--) {
            d[t] = c[i];
            t++;
        }
        char[] palinWord = new char[length];
        char[] palinWord2 = new char[length];

        char ch = '\0';

        int cntF = 0;
        int cntB = length - 1;
        int cntF2 = 0;
        int cntB2 = length - 1;

        if (length % 2 == 0) { // If Palindrome length is Even
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
        } else { // If Palindrome length is Odd

            for (int i = 0; i < length - 1; i += 2) {
                if (c[i] != c[i + 1]) {
                    ch = c[i];
                    for (int j = i; j < (length - 1); j++) {
                        c[j] = c[j + 1];
                    }
                }

            }

            if (ch != '\0') {
                for (int i = 0; i < length; i++) {
                    if (i % 2 == 0) {
                        palinWord[cntF] = c[i];
                        cntF++;
                    } else if (i % 2 != 0) {
                        palinWord[cntB] = c[i];
                        cntB--;
                    }
                }
                palinWord[(length - 1) / 2] = ch;
                System.out.println(palinWord);
            } else {
                for (int i = 0; i < length - 1; i += 2) {
                    if (d[i] != d[i + 1]) {
                        ch = d[i];
                        for (int j = i; j < (length - 1); j++) {
                            d[j] = d[j + 1];
                        }
                    }

                }

                for (int i = 0; i < length; i++) {
                    if (i % 2 == 0) {
                        palinWord2[cntF2] = d[i];
                        cntF2++;
                    } else if (i % 2 != 0) {
                        palinWord2[cntB2] = d[i];
                        cntB2--;
                    }
                }
                palinWord2[(length - 1) / 2] = ch;
                System.out.println(palinWord2);
            }

        }
    }
}
