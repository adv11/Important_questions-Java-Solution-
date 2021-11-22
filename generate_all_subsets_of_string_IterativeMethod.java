package String_problems;
/*
* Input : abc
* Output : a, b, c, ab, bc, ac, abc and one empty string ""
*/
import java.util.Scanner;

public class generate_all_subsets_of_string_IterativeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String string = sc.next();

        // finding the limit for our for loop
        // we have to run the loop from 0 to 2^length of string - 1
        int limit = (int)Math.pow(2, string.length())-1;

        // Generating permutations from 0 to 2^len of string - 1
        for(int i=0 ; i<=limit ; i++){
            String temp = "";
            int tmp_num = i;    // taking tmp_num for manipulating it
            int count = string.length()-1;  // count for accessing the character present at required index in the given string

            // while tmp_num not becomes 0
            // till then run a while loop
            // we are accessing the characters from the right of the string
            while(tmp_num != 0){
                // if the remainder is 1 then it means we have to consider the character otherwise we have to leave it
                if(tmp_num%2 == 1){
                    temp = String.valueOf(string.charAt(count)) + temp;
                }
                // we are accessing the characters from the right side of the string that's why we are decreasing the value of count
                count--;
                tmp_num /= 2;   // changing the value of tmp_num
            }
            System.out.println(temp);
        }
    }
}
