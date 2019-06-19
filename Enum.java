import java.util.*;
public class Main
{


     public static void main(String []args)
{

       Color arr[]=Color.values();

       for(Color col:arr)

       {

           System.out.println(col+" at "+col.ordinal());

          
       }

       Color c=Color.RED;

       c.disp();
    
     }
       
        Gen<Integer,String> ob=new Gen<Integer,String>(15,"Hello"); 
        ob.gt();

       
        ArrayList<Integer> arr=new ArrayList<Integer>(5);   //ArrayList	

        for(int i=1;i<=5;i++)

           arr.add(i);

        System.out.println(arr);
        
        TreeSet<String> ts=new TreeSet<String>();   //TreeSet

        ts.add("B");

        ts.add("A");

        ts.add("D");

        System.out.println(ts);
}

enum Color
    //enum
{

    RED,GREEN,BLUE;

    private Color()

    {

        System.out.println("constructor called for "+this.toString());

    }

    public void disp()

    {

        System.out.println("Color");

    }

}
class Gen<T,U>    //generic class
    
{

    T obj1;

    U obj2;

    Gen (T obj1,U obj2)

    {

        this.obj1=obj1;

        this.obj2=obj2;

    }

    public void gt()

    {

        System.out.println(obj1);

        System.out.println(obj2);

    }

}