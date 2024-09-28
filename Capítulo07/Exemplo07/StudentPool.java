//Exemple 07 - Chapter 07
//Student Pool
//Figura 7.8
//Method: Array 
//Author: Deitel
//Date of Edition: 27/SET24 - 22h33  
//Flávio Alencar

public class StudentPool
{
    public static void main(String[] args)
    {
        //                              Variables
        //----------------------------------------------------------------------
        int [] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3,
            3, 3, 2, 3, 3, 2, 14};                //New Array.        
        int [] frequency = new int [6];           //Array frequency.
        //----------------------------------------------------------------------
        
        for (int answer = 0; answer < responses.length; answer++)
        {
            try
            {
                ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.printf("   responses[%d] = %d%n%n", answer, 
                        responses[answer]);
            }
        }
        
        System.out.printf("%s%10s%n", "rating", "frequency");
        
        for (int rating = 1; rating < frequency.length; rating++)
        {
            System.out.printf("%4d%6d%n", rating, frequency[rating]);
            
        }
    }
}
