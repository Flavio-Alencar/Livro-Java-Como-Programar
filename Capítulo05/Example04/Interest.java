//Exemple 04 - Chapter 05
//compound interest.
//Figura 5.6
//Method: for 
//Author: Deitel
//Date of Edition: 18/SET24 - 16h11 
//Flávio Alencar


public class Interest
{

    public static void main(String[] args) 
    {
        //                              Variables
        //----------------------------------------------------------------------
        double p = 1000.00;             //Initial Money.
        double r = 0.05;                //tax per year;
        double a = 0.00;                //Total of amount money;
        //----------------------------------------------------------------------
        
        System.out.printf("%6s%23s%n", "Year", "Amount of Money");
        
        for (int n = 1; n <= 10; n++)
        {
            //a = p * Math.pow(1 + r, n);
           a = p * (1 + r);
           p = a;
            
            System.out.printf("%4d%,20.2f%n", n, a);
        }
        
        
    }
}
