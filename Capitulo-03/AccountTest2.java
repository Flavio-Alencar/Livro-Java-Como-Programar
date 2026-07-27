package Capitulo03;
import java.util.Scanner;

//Exemplo 02 - Capítulo 03
//Flavio Silvestre de Alencar - 27Jul26 - 16h26
//Descrição: Classe Account que contém uma variável de instância name e métodos
//para configurar e obter seu valor com o uso do construtor.
//------------------------------------------------------------------------------

public class AccountTest2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
    //Declaração de Variável Local
    //----------------------------------------------------------------------
    String theName;
    //----------------------------------------------------------------------
    
    Account2 Account1 = new Account2("Flávio");
    Account2 Account2 = new Account2("Carol");
    
    System.out.printf(("O Nome do Cliente 1: %s%n"), Account1.getName());
    System.out.printf(("O Nome do Cliente 2: %s%n"), Account2.getName());
        
    }
    
}
