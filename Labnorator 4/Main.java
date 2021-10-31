import java.io.*;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        try
       {
           File file1 = new File("D:\\java\\Lab 4\\one_expression.txt");
            Scanner input1 = new Scanner(file1);
             while(input1.hasNextLine()) 
            {
                String s=input1.nextLine();
                 Expresions exp=new Expresions(s);
                  exp.output(s);
            }
             System.out.println();
            
            File file2 = new File("D:\\java\\Lab 4\\three_expressions.txt");
             Scanner input2 = new Scanner(file2);
              while(input2.hasNextLine()) 
            {
                String s=input2.nextLine();
                 Expresions exp=new Expresions(s);
                  exp.output(s);
            }
        }
            catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
}
