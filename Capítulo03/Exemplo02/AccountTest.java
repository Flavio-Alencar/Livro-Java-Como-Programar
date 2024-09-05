//Exemplo 02 - Capítulo 03
//Métodos Set e Get
//Classe Account com uma variável de instância balance do tipo double e um construtor
// e método deposit que executa a validação.
//Autor: Deitel
//Data de Edição do Exemplo: 02/SET24 - 16h00

import java.util.Scanner;

public class AccountTest 
{
    public static void main(String[] args)
    {
        Account account1 = new Account("Flávio Alencar", 1000);
        Account account2 = new Account ("Carol Alencar", 1500.50);
        
        //Exibe o Saldo de Cada Objeto
        System.out.printf("%s Balance: $%.2f %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s Balance: $%.2f %n",
                account2.getName(), account2.getBalance());
        
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Depoist Amount for Account 1 $: ");
        double depositAmount = scan.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance: %n%n",
                depositAmount);
        account1.deposit(depositAmount);     // adiciona o saldo de account1
        
        //Exibe os Saldos
        System.out.printf("%s Balance: $%.2f %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s Balance: $%.2f %n",
                account2.getName(), account2.getBalance());
        
        System.out.print("Enter Depoist Amount for Account 2 $: ");
        depositAmount = scan.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance: %n%n",
                depositAmount);
        account2.deposit(depositAmount);     // adiciona o saldo de account1
        
        //Exibe os Saldos
        System.out.printf("%s Balance: $%.2f %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s Balance: $%.2f %n",
                account2.getName(), account2.getBalance());
        
        
        
    }
    
}
