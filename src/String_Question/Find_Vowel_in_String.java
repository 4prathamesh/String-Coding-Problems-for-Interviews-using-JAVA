package String_Question;
import java.util.*;
public class Find_Vowel_in_String {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				System.out.println(count);
				count=0;
				i++;
			}
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}



