import java.util.Scanner;

public class Main

{

	public static void main(String[] args)
 {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a value: ");

		int a=sc.nextInt();

		int j=0;

		int arr[];

		arr=new int[100];

		for(int i=1;i<=a;i++)

		{

		 if(a%i==0)

		 {

		     arr[j]=i;

		     j++;

		 }

		}

		System.out.println("The factors are: ");

		for(int i=0;i<j;i++)

		  System.out.println(arr[i]);

	}

}
