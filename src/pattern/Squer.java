//* * * * * 
//*       * 
//*       * 
//*       * 
//*       * 
//* * * * * 
package pattern;
public class Squer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i<2 || i>5 || j==5 || j==1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
                
                // if(i==1 || i==6 || j==1 || j==6){
                //     System.out.print("*");
                // }
            }
            System.out.println();
        }
	}

}
