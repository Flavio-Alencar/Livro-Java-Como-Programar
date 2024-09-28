//Exemple 02 - Chapter 07
//Array Initing
//Figura 7.3
//Method: Array 
//Author: Deitel
//Date of Edition: 25/SET24 - 20h53  
//Flávio Alencar

public class InitArray 
{
    public static void main(String[] args) 
    {
        //                              Variables
        //----------------------------------------------------------------------
        int [] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};   //Initing Array.        
        //----------------------------------------------------------------------
        
        System.out.printf("%s%8s%n", "Index", "Value");
        
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("%3d%8d%n", i, array[i]);
        }
        
                
    }
}