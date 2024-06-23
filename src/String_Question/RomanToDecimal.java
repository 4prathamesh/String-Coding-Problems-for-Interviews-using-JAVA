package String_Question;
import java.io.*;
import java.util.*;
//User function Template for Java

class Solutions {
 // Finds decimal value of a given roman numeral
 public int romanToDecimal(String str) {
     // code here
     Map<Character , Integer> map= new LinkedHashMap<Character , Integer>();
     map.put('I',1);
     map.put('V',5);
     map.put('X',10);
     map.put('L',50);
     map.put('C',100);
     map.put('D',500);
     map.put('M',1000);
    		int res = 0;
     
		for (int i = 0; i < str.length(); i++) {

			int s1 = map.get(str.charAt(i));

			if (i + 1 < str.length()) {
				int s2 = map.get(str.charAt(i + 1));
				if (s1 >= s2) {
					res = res + s1;
				}
				else {
					res = res + s2 - s1;
					i++;
				}
			}
			else {
				res = res + s1;
			}
		}

		return res;
 }
}
public class RomanToDecimal {

	public static void main(String[] args)throws Exception {
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		        int tc = Integer.parseInt(br.readLine().trim());
		        while (tc-- > 0) {
		            String roman = br.readLine().trim();
		            Solutions ob = new Solutions();
		            System.out.println(ob.romanToDecimal(roman));
		        }

	}

}
