//Exercício 3.1 do Capítulo 03 - 3.6
//Modifique o programa de adição na Figura 2.7 para utilizar entrada e saída baseadas em caixas de diálogo com os métodos
//da classe JOptionPane. Uma vez que o método showInputDialog retorna uma String, você deve converter a String que
//o usuário insere em um int para utilização em cálculos. O método static parseInt da classe Integer (pacote java.
//lang) recebe um argumento String que representa um inteiro e retorna o valor como um int. Se a String não contiver
//um inteiro válido, o programa terminará com um erro.

import javax.swing.JOptionPane;


public class Ch03Exercicio3_1
{
    public static void main(String[] args)
    {
        //Declaração de Variáveis
        //---------------------------------------------------------------------
        
        String m1;     //Valor do Primeiro Número Inteiro (String)
        String m2;     //Valor do Segundo Número Inteiro. (String)
        int n1;        //Valor do Primeiro Número Inteiro (int);
        int n2;        //Valor do Segundo Número Inteiro (int);
        int soma;   //Valor da Soma dos Números.
        
        //---------------------------------------------------------------------
        
        m1 = JOptionPane.showInputDialog("Digite o Primeiro Número Inteiro");
        
        m2 = JOptionPane.showInputDialog("Digite o Segundo Número Inteiro");
        
        n1 = Integer.parseInt(m1);          //Converte a String m1 em int n1;
        n2 = Integer.parseInt(m2);          //Converte a String m2 em int n2;
        
        soma = n1 + n2;
        
        JOptionPane.showMessageDialog(null, "A Soma dos Números Informado é: " +soma);
        
       
        
        
        
    }
}
