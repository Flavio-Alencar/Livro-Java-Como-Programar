//Exemple 03 - Chapter 07
//Calculating Values of Array 
//Figura 7.4
//Method: Array 
//Author: Deitel
//Date of Edition: 25/SET24 - 21h03  
//Flávio Alencar

public class InitArray
{   
    public static void main(String[] args) 
    {
        //                              Variables
        //----------------------------------------------------------------------
        final int array_length = 10;          //Constant Variable.
        int [] array = new int[array_length]; //New Array.        
        //----------------------------------------------------------------------
        
        System.out.printf("%s%8s%n", "Index", "Value");
        
        for (int i = 0; i < array_length; i++)
        {
            array[i] = 2 + 2 * i;
            System.out.printf("%3d%8d%n", i, array[i]);
        }
        
                
    }
}