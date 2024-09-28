//Exemple 04 - Chapter 07
//Sum Elements of Array
//Figura 7.5
//Method: Array 
//Author: Deitel
//Date of Edition: 27/SET24 - 14h12  
//Flávio Alencar


public class SumArray 
{
    public static void main(String[] args)
    {
        //                              Variables
        //----------------------------------------------------------------------
        int [] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87}; //New Array.        
        int total = 0;                                            //Sum the elements of Array     
        //----------------------------------------------------------------------
        
        for (int counter = 0; counter < array.length; counter++)
        {
            total += array[counter];
        }
        
        System.out.println("The Sum of Elements of Array: " +total);
        
    }
}
