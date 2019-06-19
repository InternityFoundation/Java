public class Main
{


     public static void main(String []args)
{

        for(int i=0;i<5;i++)

        {

           threading obj=new threading();

           obj.start();

        }

     }

}

class threading extends Thread
    //multithreading
{
   public void run()

{

    try

    {

        System.out.println("Thread "+Thread.currentThread().getId()+" is running");

    }

    catch(Exception e)

    {

        System.out.println("Exception is caught");

    }

}

}
class outer   //inner class

{

     public void outr()

    {

        System.out.println("Outer class");

    class inner

    {

        public void show()

        {

            System.out.println("Nested class");

        }

    }

    inner ob=new inner();

    ob.show();

    }
}
