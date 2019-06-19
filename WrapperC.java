public class WrapperC
{


     public static void main(String []args)
{

        int a=3;

        double d=2.35d;

        boolean b= true;

        Double m=d;    //double to object

        Boolean c=new Boolean(b);    //boolean to object

        Integer i=a;   //int to object


        System.out.println(m+" "+c+" "+i);   //printing objects


        int j =a;      //object to int

        double k=m;    //object to double

        boolean l=c;    //object to boolean

        System.out.println(k+" "+l+" "+j);
  //printing values
    }

}