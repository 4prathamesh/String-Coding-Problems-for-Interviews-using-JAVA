import java.util.*;
import java.io.*;
public class Reverse_Words_of_String
{
    public static void main(String x[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc= new Scanner(System.in);
        System.out.println("enter the String");
        String str=br.readLine();

        String str1[]=str.split(" ");

       // System.out.println(str1[0]);
        for(int i=0;i<str1.length/2;i++)
        {
            String temp=str1[i];
            str1[i]=str1[str1.length-i-1];
            str1[str1.length-i-1]=temp;
        }
        for(int i=0;i<str1.length;i++)
        {
            System.out.print(str1[i]+"\t");
        }
    }
}
// enter the String
//InPut :- abc def geh
//OutPut :- geh	def	abc	
