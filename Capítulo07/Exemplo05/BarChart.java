//Exemple 05 - Chapter 07
//Bar Chart 
//Figura 7.6
//Method: Array 
//Author: Deitel
//Date of Edition: 27/SET24 - 14h25  
//Flávio Alencar


public class BarChart 
{
    public static void main(String[] args) 
    {
        //                              Variables
        //----------------------------------------------------------------------
        int [] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};          //New Array.        
        //----------------------------------------------------------------------
        
        System.out.println("Grade Distribution"); 
        
        for (int counter = 0; counter < array.length; counter++)
        {
            if (counter == 10)
            {
                System.out.printf("%7d: ", 100);
            }
            else
            {
                System.out.printf("%02d - %02d: ", counter * 10, counter * 10 + 9);
            }
            
            for (int stars = 0; stars < array[counter]; stars++)
            {
                System.out.print("*");
            }
        
            System.out.println();
        }
                
    }
}
