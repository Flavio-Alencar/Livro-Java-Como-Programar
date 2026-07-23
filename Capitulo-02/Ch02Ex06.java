package Capitulo02;
import java.util.Scanner;

//Exemplo 06 - Capítulo 02
//Flavio Silvestre de Alencar - 27Jul26 - 15h30
//Descrição: Programa que Compara inteiros utilizando instruções if, operadores 
//relacionais e operadores de igualdade.
//------------------------------------------------------------------------------

public class Ch02Ex06 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        
        //Declaração de Variáveis Globais
        //----------------------------------------------------------------------
          int n1;
          int n2;
        //----------------------------------------------------------------------
        
        System.out.print("Digite um Número Inteiro: ");
        n1 = input.nextInt();
        System.out.println(" ");
        
        System.out.print("Digite um Número Inteiro: ");
        n2 = input.nextInt();
        System.out.println(" ");
        
        if (n1 == n2)
            System.out.printf("%d%s%d%n", n1, " igual ", n2);
        
        if (n1 != n2)
            System.out.printf("%d%s%d%n", n1, " diferente ", n2);
        
        if (n1 > n2)
            System.out.printf("%d%s%d%n", n1, " maior ", n2);
        
        if (n1 < n2)
            System.out.printf("%d%s%d%n", n1, " menor ", n2);
    }
    
}
