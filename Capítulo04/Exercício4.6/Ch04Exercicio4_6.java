//Exercício 4.6 - Capítulo 04
//Method while - if - else
//Date: 11/SET24 - 15h30
//Flávio Alencar

public class Ch04Exercicio4_6 
{
    public static void main(String[] args)
    {
        //Variables
        //----------------------------------------------------------------------
        int x = 0;          //Variable x.
        int sum = 0;        //Variable sum.
        int count = 1;      //Variable Count
        //----------------------------------------------------------------------
        
        while (count <= 10)
        {
            ++x;
            sum += x;
            ++count;
            
        }
        
        System.out.println("The Sum is: " +sum);
        
    }
}
