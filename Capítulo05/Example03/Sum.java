//Exemple 03 - Chapter 05
//Sun the number of 2 to 20.
//Figura 5.5
//Method: for 
//Author: Deitel
//Date of Edition: 18/SET24 - 10h46 AM
//Flávio Alencar


public class Sum 
{
    public static void main(String[] args)
    {
        //                                 Variables
        //----------------------------------------------------------------------
        int sum = 0;          //Variable Sum.
        //----------------------------------------------------------------------
        
        for (int i = 2; i <= 20; i += 2)
        {
            sum += i;
        }
        
        System.out.println("The sum of the number: " +sum);
    }
}
