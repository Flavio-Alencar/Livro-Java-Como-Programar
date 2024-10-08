//Exemple 06 - Chapter 07
//Roll Die
//Figura 7.7
//Method: Array 
//Author: Deitel
//Date of Edition: 27/SET24 - 15h09  
//Flávio Alencar

import java.security.SecureRandom;

public class RollDie 
{
    public static void main(String[] args)
    {
        SecureRandom randomNumbers = new SecureRandom();
        
        //                              Variables
        //----------------------------------------------------------------------
        int [] frequency = new int[7];          //New Array.        
        //----------------------------------------------------------------------
        
        for (int roll = 1; roll <= 6000000; roll++)
        {
            ++frequency[1 + randomNumbers.nextInt(6)];
        }
        
        System.out.printf("%s%10s%n", "Face", "Frequency");
        
        for (int face = 1; face < frequency.length; face++)
        {
            System.out.printf("%2d%10d%n", face, frequency[face]);
        }
    }
}
