//Exemplo 04 - Capítulo 04
//Figura 4.12
//Method while 
//Autor: Deitel
//Data of Edition: 09/SET24 - 14h13
//Flávio Alencar

import java.util.Scanner;


public class Analysis 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Variables
        //----------------------------------------------------------------------
        int nStudent = 0;           //Number of Students.
        int studentCounter = 1;     //Counter.
        int passes = 0;             //Number of Approved.
        int failures = 0;            //Number of Failed.
        double taxpasses = 0.0;     //Tax of Approved.
        double taxfailure = 0.0;    //Tax of Failed.
        //----------------------------------------------------------------------
        
        System.out.print("Enter the Number of Students: ");
        nStudent = scan.nextInt();
        System.out.println();
        
        while (studentCounter <= nStudent)
        {
            System.out.print("Enter Result [1 - Pass], [2 - Fail]: ");
            int result = scan.nextInt();
                        
            if (result == 1)
            {
                passes = passes + 1;
            }
            else
            {
                failures = failures + 1;
            }
            
            studentCounter = studentCounter + 1;
        }
        
          taxpasses = (double) passes/nStudent*100;
          taxfailure = (double)failures/nStudent*100;
          System.out.println();
                       
        System.out.printf("Passed: %d%n%n", passes);
        System.out.printf("Failures: %d%n%n", failures);
        System.out.printf("Tax of Approved: %.2f%s%n", taxpasses, "%");
                
        if (taxpasses >= 80.00)
        {
           System.out.println("Bonus to Instrutor");
        }
        
        
        
        
    }
}
