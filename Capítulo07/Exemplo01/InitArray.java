//Exemple 01 - Chapter 07
//Array Initing
//Figura 7.2
//Method: Array 
//Author: Deitel
//Date of Edition: 25/SET24 - 20h15  
//Flávio Alencar

public class InitArray 
{
    public static void main(String[] args) 
    {
        //                              Variables
        //----------------------------------------------------------------------
        int [] array = new int[10];          //Array.
        //----------------------------------------------------------------------
        
        System.out.printf("%s%8s%n", "Index", "Value");
        
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("%3d%8d%n", i, array[i]);
        }
        
                
    }
}
