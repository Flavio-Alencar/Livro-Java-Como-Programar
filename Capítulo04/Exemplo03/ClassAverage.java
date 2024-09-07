//Exemplo 03 - Capítulo 04
//Figura 4.10
//Métodos while - Utilização de Sentinela
//Autor: Deitel
//Data de Edição do Exemplo: 06/SET24 - 21h53
//Flávio Alencar

import java.util.Scanner;

public class ClassAverage
{
    public static void main(String[] args)
    {
        //Declaração de Variáveis Locais
        //-----------------------------------------------------------------------------------
        Scanner scan = new Scanner(System.in);
        double total = 0.0;          //Variável Local que Armazena o Total da Soma das Notas;
        double nota = 0.0;           //Variável Local que Armazena o valor da Nota; 
        double average = 0.0;        //Variável Local que Aramazena a Média.
        int gradeCounter = 0;        //Variável Local que Armazena a Quantidade de Notas.
        //-----------------------------------------------------------------------------------
        
        System.out.print("Digite a Nota ou -1 para Parar: ");
        nota = scan.nextDouble();
        System.out.println();
        
        while (nota != -1)
        {
            total = total + nota;
            gradeCounter = gradeCounter + 1;
            System.out.print("Digite a Nota ou -1 para Parar: ");
            nota = scan.nextDouble();
            System.out.println();
        }
        
        if (gradeCounter != 0)
        {
            average = total/gradeCounter;
            
            System.out.printf("Quantidade de Alunos: %d%n", gradeCounter);
            System.out.printf("Média de Notas da Classe: %.2f%n", average);
        }
        else
        {
            System.out.println("Nenhuma Nota foi Inserida");
        }
        
    }
}
