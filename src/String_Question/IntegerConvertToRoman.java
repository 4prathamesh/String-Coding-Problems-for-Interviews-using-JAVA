package String_Question;
import java.util.*;
class Solution
{
	String convertToRoman(int n) {
		//code here
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
 
        StringBuilder result = new StringBuilder();
 
        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                n -= values[i];
                result.append(s[i]);
            }
        }
 
        return result.toString();
	}
}
public class IntegerConvertToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution obb = new Solution();
			System.out.println(obb.convertToRoman(N));
			t--;
		}
	}

}
