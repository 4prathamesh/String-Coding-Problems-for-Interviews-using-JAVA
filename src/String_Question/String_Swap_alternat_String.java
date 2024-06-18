package String_Question;

public class String_Swap_alternat_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc="abcdefgh";
        String abc1[]=abc.split("");
        int i=0;
        int j=i+1;
        while(i!=abc1.length)
        {
            if(j%2!=0)
            {
                String temp=abc1[i];
                abc1[i]=abc1[j];
                abc1[j]=temp;
            }
    
            
                i++;
                j++;
            
        }
        for(i=0;i<abc1.length;i++)
        {
            System.out.print(abc1[i]);
        }
	}

}
