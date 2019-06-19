public class Sum
{

     
        int m,n;

     public static void main(String []args)
{

        int a=10,b=20;

        float c=10.0f,d=20.0f;

        int vol;

        Sum obj=new Sum();

        Sum obj1=new Sum();

        Sum obj2=new Sum(5,4);//constructor overloading

        int res1=obj.sum(a,b);

        System.out.println(res1);

        float res2=obj.sum(c,d);

        System.out.println(res2);

        m1();

        vol=obj1.volume();

        System.out.println(vol);

        vol=obj2.volume();

        System.out.println(vol);

     }

    Sum()

     {

         m=5;

         n=4;

     }

     Sum(int x,int y)

     {

         m=x;

         n=y;

     }

     public int sum(int a,int b)

    {

        return (a+b);

    }

    public float sum(float a,float b) //overloading

    {

        return (a+b);

    }

    static void m1()   //static method

    {

        System.out.println("Static block");

    }

    public int volume()

    {

        return (m*n);

    }

}