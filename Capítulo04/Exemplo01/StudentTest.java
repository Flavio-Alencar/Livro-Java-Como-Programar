//Exemplo 01 - Capítulo 04
//Figura 4.4
//Métodos if - else
//Classe Account com uma variável de instância balance do tipo double e um construtor
// e método deposit que executa a validação.
//Autor: Deitel
//Data de Edição do Exemplo: 02/SET24 - 15h32

import java.util.Scanner;

public class StudentTest
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis Locais
        //----------------------------------------------------------------------
        String name1 = "";           //Armazena o Nome1.
        String name2 = "";           //Armazena o Nome2.
        double nota1aluno1 = 0.0;       //Armazena a Nota 1 do Aluno 01.
        double nota2aluno1 = 0.0;       //Armazena a Nota 2 do Aluno 01.        
        double nota1aluno2 = 0.0;       //Armazena a Nota 1 do Aluno 02.
        double nota2aluno2 = 0.0;       //Armazena a Nota 1 do Aluno 02.
        double average1 = 0.00;         //Armazena a Média2
        double average2 = 0.00;         //Armazena a Média2
        //----------------------------------------------------------------------
        
        System.out.print("Digite o Nome do Primeiro Aluno: ");
        name1 = scan.nextLine();
        System.out.println("");
        
        System.out.print("Digite o Nome do Segundo Aluno: ");
        name2 = scan.nextLine();
        System.out.println("");
        
        System.out.printf("Digite a Nota1 do Aluno(a): %s%n",name1);
        nota1aluno1 = scan.nextDouble();
        System.out.println("");
        
        System.out.printf("Digite a Nota2 do Aluno(a): %s%n", name1);
        nota2aluno1 = scan.nextDouble();
        System.out.println("");
        
        System.out.printf("Digite a Nota1 do Aluno(a): %s%n", name2);
        nota1aluno2 = scan.nextDouble();
        System.out.println("");
        
        System.out.printf("Digite a Nota2 do Aluno(a): %s%n", name2);
        nota2aluno2 = scan.nextDouble();
        System.out.println("");
        
        average1 = ((nota1aluno1 + nota2aluno1)/2);
        average2 = ((nota1aluno2 + nota2aluno2)/2);
        
        Student account1 = new Student(name1, average1);
        Student account2 = new Student(name2, average2);
        
        System.out.printf("Aluno: %s%n", account1.getName());
        System.out.printf("Nota 01: %.2f%n", nota1aluno1);
        System.out.printf("Nota 02: %.2f%n", nota2aluno1);
        System.out.printf("Média: %.2f%n", average1);
        System.out.printf("A menção é: %s%n%n", account1.getLetterGrade());
        
        System.out.printf("Aluno: %s%n", account2.getName());
        System.out.printf("Nota 01: %.2f%n", nota1aluno2);
        System.out.printf("Nota 02: %.2f%n", nota2aluno2);
        System.out.printf("Média: %.2f%n", average2);
        System.out.printf("A menção é: %s%n%n", account2.getLetterGrade());
        
        
        
        
    }
    
}
