//Exemplo 01 - Capítulo 03
//Métodos Set e Get
//Autor: Deitel
//Data de Edição do Exemplo: 02SET24 - 13h17

//import java.util.Scanner;

public class AccountTest 
{
    public static void main (String[] args)
    {
        // cria um objeto Scanner para obter entrada a partir da janela de comando
        //Scanner scan = new Scanner(System.in);
        
        //Cria um Objeto Account e o atribui a myAccont
        Account Account1= new Account("Flávio Alencar");
        Account Account2 = new Account("Carolyne Alencar");
        
        //Exibe o Valor Inicial do Nome (null).
        //System.out.printf("Initial Name: %s%n", myAccount.getName());
        
        //Exibe o Valor Inicial de cada Account
        System.out.printf("Account1 Name: %s%n%n", Account1.getName());
        System.out.printf("Account2 Name: %s%n%n", Account2.getName());
        
        /*//Solicita e Lê o Nome
        System.out.print("Please Enter the Name: ");
        String theName = scan.nextLine(); //Lê uma linha de Texto.
        myAccount.setName(theName);       //Insere theName em myAccont.
        System.out.println();
        
        //Exibe o NOme Armazenado no Objeto myAccont
        System.out.printf("Name in Object myAccont is: %s%n", myAccount.getName());*/
        
        
        
    }
    
}