//Exemple 01 - Chapter 05
//Figura 5.1
//Method: while 
//Author: Deitel
//Date of Edition: 18/SET24 - 10h06 AM
//Flávio Alencar
public class WhileCounter {

    public static void main(String[] args) 
    {
        
        //                                 Variables
        //----------------------------------------------------------------------
        int counter = 1;          //Variable Counter.
        //----------------------------------------------------------------------
        
        while (counter <= 10)
        {
            System.out.printf("%d%s", counter, " ");
            ++counter;
        }
    
    }
}
