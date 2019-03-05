/*
Question : 
Analyze the output given in the samples for an input, N.
Write a program that prints the similar pattern.

Input:
* One line containing an integer, N

Output:
* A pattern of stars '*', to be deduced from samples

Constraints:
* 0<N<999

Sample Input:
5

Sample Output:
    *****
   *   *
  *   *
 *   *
*****

Sample Input:
3

Sample Output:
  ***
 * *
***

-Manthan Lal-
*/


import java.lang.*;
import java.io.*;
import java.util.*;

class pattern2 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        Solution s = new Solution();
        s.solution(n);
    }
}

class Solution{
    public void solution(int n){
        for(int i=n; i>0; i--){
            for(int j=i-1; j>0; j--){
                System.out.print(" ");
            }  
            
            if(i<n && i>1){
                System.out.print("*");
                for(int m=2; m<n; m++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else if(i==n || i==1)
                for(int k=n; k>=1; k--){
                    System.out.print("*");
                }

            System.out.print("\n");
        }
    }
}
