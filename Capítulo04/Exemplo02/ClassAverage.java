//Exemplo 02 - Capítulo 04
//Figura 4.8
//Métodos while
//Figura 4.8: ClassAverage.java
//Autor: Deitel
//Data de Edição do Exemplo: 06/SET24 - 21h06
//Flávio Alencar

import java.util.Scanner;

public class ClassAverage
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis Locais
        //----------------------------------------------------------------------
        double total = 0;          //Variável que Armazena as Notas Inseridas;
        double notas = 0;          //Variável que armazena as Notas Inseridas.
        double average = 0;        //Variável qeu Armazena a Média
        int gradeCounter = 1;      //Variável que será o Contador
        int qntAlunos = 0;         //Variável que Armazena a quantidade de Alunos.
        //------------------------------------------------------------------------
        
        System.out.print("Digite a Quantidade de Alunos: ");
        qntAlunos = scan.nextInt();
        System.out.println();
        
        //Amazenamento e Repetição
        while (gradeCounter <= qntAlunos)
        {
            System.out.print("Digite a nota: ");
            notas = scan.nextDouble();
            total = total + notas;
            gradeCounter = gradeCounter + 1;
            System.out.println();
        }
        
        average = (total/qntAlunos);
        
        System.out.printf("Quantidade de Alunos: %d%n", qntAlunos);
        System.out.printf("Média de Notas da Sala: %.2f%n", average);
        
    }
    
}