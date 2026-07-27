package Capitulo03;
import java.util.Scanner;

//Exemplo 01 - Capítulo 03
//Flavio Silvestre de Alencar - 27Jul26 - 16h26
//Descrição: Classe Account1 que contém uma variável de instância name e métodos
//para configurar e obter seu valor.
//------------------------------------------------------------------------------

public class AccountTest1
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
    
    //Declaração de Variável Local
    //----------------------------------------------------------------------
    String theName;
    //----------------------------------------------------------------------
    
    Account1 myAccount = new Account1();
    
    System.out.println(" ");
    System.out.print("Digite o Nome Completo: ");
    theName = input.nextLine();
    myAccount.setName(theName);
    System.out.println(" ");
    System.out.printf(("O Nome no Objeto myAccount é: %s%n"), myAccount.getName());
        
    }    
    
}
