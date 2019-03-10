import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        in.close();
        int length = word.length() - 1;
        int flag = 0, count = length;
        for (int i = 0; i < length - 1; i++) {
            if (word.charAt(i) != word.charAt(count--)) {
                flag++;
            }
        }
        if (flag != 0)
            System.out.println("String is Not Palindrome");
        else
            System.out.println("String is Palindrome");
    }
}