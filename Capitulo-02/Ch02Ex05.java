//Exemplo 04 - Capítulo 02
//Flavio Silvestre de Alencar - 29JAN26 - 21h29
//Descrição: Programa Impressão de Texto com o Método System.out.printf.
//------------------------------------------------------------------------------

package Exemplos.Capitulo02;
import java.util.Scanner;
        
public class Ch02Ex05 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //Declaração de Variáveis Globais
        //----------------------------------------------------------------------
          int n1;
          int n2;
          int soma;
        //----------------------------------------------------------------------
        
        System.out.print("Digite o Valor de n1: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o Valor de n2: ");
        n2 = input.nextInt();
        
        soma = n1 + n2;
        
        System.out.printf("n1 + n2 = %d%n", soma);
    }
    
}
