/**
 * Demonstration source code.
 * Demonstrates use of:
 *   console interface and model objects
 *   while loops
 *   if else logic
 * 
 * @author GrayKnight 
 * @version 10/11/12 10/13/17
 */
import java.util.Scanner;

public class TriangleDriver
{
    private TriangleModeler doNow = new TriangleModeler();
    private Scanner scan = new Scanner(System.in);
    private Scanner scan2 = new Scanner(System.in);


    //surveys the user for information
    //controls execution
    public void makeTriangles()
    {
        String sentinel = "y";
        int count1, count2, count3;
      
        while(sentinel.equals("y"))
        {
            System.out.println("Enter 3 integer side lengths of a triangle.");
            System.out.print("First side:");
            count1 = scan.nextInt();
            System.out.print("Second side:");
            count2 = scan.nextInt();
            System.out.print("Third side:");
            count3 = scan.nextInt();
            
            System.out.println(doNow.isTriangle(count1, count2, count3));
            
            System.out.print("Try Again? (y or n):");
            sentinel = scan2.nextLine();
        } 
        System.out.println("Goodbye!");
    }
}
