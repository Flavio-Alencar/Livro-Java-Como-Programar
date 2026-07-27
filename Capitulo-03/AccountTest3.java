package Capitulo03;
import java.util.Scanner;

//Exemplo 03 - Capítulo 03
//Flavio Silvestre de Alencar - 27Jul26 - 16h26
//Descrição: Classe Account3 com uma variável de instância balance do tipo double
//e um construtor e método deposit que executa a validação.
//------------------------------------------------------------------------------

public class AccountTest3 
{
    public static void main(String[] args)
    {
        //Declaração de Variável Local
    //----------------------------------------------------------------------
    double depositAmmount;
    //----------------------------------------------------------------------
    
    Scanner input = new Scanner(System.in);
    
    Account3 account1 = new Account3("Flávio", 1800.10);
    Account3 account2 = new Account3("Carol", 2000.070);
    
        System.out.println(" ");
        System.out.printf(("%s%s%.2f%n"), account1.getName(), " R$:" , account1.getBalance());
        System.out.printf(("%s%s%.2f%n"), account2.getName(), " R$:" , account2.getBalance());
        System.out.println(" ");
        
        System.out.print("Digite o Valor de Deposito para a Conta 1 [R$]: ");
        depositAmmount = input.nextDouble();
        account1.deposit(depositAmmount);
        System.out.println(" ");        
        System.out.printf(("%s%s%.2f%n"), account1.getName(), " R$:" , account1.getBalance());
        System.out.println(" ");
        
        System.out.print("Digite o Valor de Deposito para a Conta 2 [R$]: ");
        depositAmmount = input.nextDouble();
        account2.deposit(depositAmmount);
        System.out.println(" ");        
        System.out.printf(("%s%s%.2f%n"), account2.getName(), " R$:" , account2.getBalance());
        System.out.println(" ");      
        
    
    }
    
}
