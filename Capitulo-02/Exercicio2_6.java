package Capitulo02;
import java.util.Scanner;

//Exeercício de Revisão 2.6 - Capítulo 02
//Flavio Silvestre de Alencar - 27Jul26 - 16h00
//Descrição: Programa que calcule e imprima o produto de três inteiros.
//------------------------------------------------------------------------------

public class Exercicio2_6 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //Declaração de Variáveis Globais
        //----------------------------------------------------------------------
          int n1;
          int n2;
          int n3;
          int prod;
        //----------------------------------------------------------------------
        
        System.out.print("Digite um Número Inteiro: ");
        n1 = input.nextInt();
        System.out.println("");
        
        System.out.print("Digite um Número Inteiro: ");
        n2 = input.nextInt();
        System.out.println("");
        
        System.out.print("Digite um Número Inteiro: ");
        n3 = input.nextInt();
        System.out.println("");
        
        prod = n1 * n2 * n3;
        
        System.out.printf("O Produto dos Números Digitado = %d%n", prod);
        
    }
    
}
