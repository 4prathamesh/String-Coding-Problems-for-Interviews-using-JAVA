package String_Question;
import java.util.*;
public class LongestCommonPrefix_using_StringWord {

	public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        sc.nextLine();
        String str[]= new String[size];
        System.out.println("enter the words");
        for(int i=0;i<size;i++)
        {
            str[i]=sc.nextLine();
        }

        int j = 0;
        boolean flag = true; // Set initial flag to true
        while (flag && j < str[0].length()) { // Iterate until flag becomes false or j exceeds length of any word
            char ch = str[0].charAt(j); // Get character at index j from the first word
            for (int i = 1; i < size; i++) {
                // If character at index j in any word doesn't match, set flag to false and break the loop
                if (j >= str[i].length() || str[i].charAt(j) != ch) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(ch); // Print common character at index j
                j++;
            }
        }


	}

}
