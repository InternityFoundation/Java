class Encap

{

    int n=10; //encapsulation

    public void loop()

    {

        for(int i=1;i<=this.n;i++)

        {

            System.out.println(n);

        }

    }

}

class Inherit extends Encap   //Inheritance

{

    
    public void loop()  //overriding method

    {

        for(int i=1;i<=super.n;i++)

        {

            System.out.println(n*2);

        }

    }

}

interface shape    //interface
{

    void area();

}

class rect implements shape

{

    int l=3,b=2;

    public void area()

    {

        System.out.println(l*b);

    }

}

abstract class Shape   //Abstract class

{
    public void pr()

    {
        System.out.println("Shape");

    }

    abstract public void draw();

}

class circle extends Shape
{

    public void draw()

    {
        System.out.println("Circle");

    }

}

 public class Main
{

    public static void main(String []args)
    {

        Encap obj=new Encap();

        obj.loop();

        Inherit obj1=new Inherit();

        obj1.loop();

        rect obj2=new rect();

        obj2.area();

        circle ob=new circle();

        ob.pr();

        ob.draw();

    }

}