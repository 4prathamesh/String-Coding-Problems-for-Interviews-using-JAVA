//---1		
//--2-2--
// 3 3 3
//4 4 4 4
package pattern;

public class Pattern123 {

	public static void main(String[] args) {
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<8;j++)
			{
				
				if(j>=4-i && j<=3+i && i%2!=0 && j%2==0)
				{
					System.out.print(i);
				}
				else if(j>=4-i && j<=3+i && i%2==0 && j%2!=0)
				{
					System.out.print(i);
				}	
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
