import java.io.*;

public class Files

{

     public static void main(String []args)
{
        FileWriter fw;   //FileWriter

        try

        {

            fw=new FileWriter("ABC.txt");

            BufferedWriter bw=new BufferedWriter(fw);   //BufferedWriter

            System.out.println("Started writing");

            bw.write(22);

            bw.close();

            System.out.println("written successfully");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   //BufferedReader
            System.out.println("Enter directory path: ");

            String path=br.readLine();

            System.out.println("Enter directory name: ");

            String name=br.readLine();

            File f=new File(path,name);   //File class

            if(f.exists())

            {

                System.out.println("File is readable: "+f.canRead());

                System.out.println("File is writable: "+f.canWrite());

                System.out.println("Enter name with which file is to be renamed: ");

                String name1=br.readLine();

                File f2=new File(name1);

                System.out.println("File has been renamed: "+f.renameTo(f2));

                System.out.println("File is deleted: "+f.delete());

            }
        }

        catch(IOException e)

        {

            e.printStackTrace();

        }

     }

}