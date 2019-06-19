public class Excpt

{

    public static void main(String []args)

    {
  
        int arr[]=new int[4];

        try

        {

            int j=check(arr);

                }

        catch(ArrayIndexOutOfBoundsException e)

        {

            System.out.println("Exception");

        }

        
    }

    static int check(int arr[])

    {

                int m=arr[4];

                return m;

       }

}