package Capitulo03;
import javax.swing.JOptionPane;

//Exercício 01 - Capítulo 03
//Flavio Silvestre de Alencar - 27Jul26 - 09h24
//Descrição: Modifique o programa de adição do capítulo 2 para utilizar entrada 
//e saída baseadas em caixas de diálogo com os métodos da classe JOptionPane.
//------------------------------------------------------------------------------

public class SomaDialog
{
    public static void main(String[] args)
    {
        //Declaração de Variáveis
        //----------------------------------------------------------------------
          int n1;
          int n2;
          int soma;
          String numero1;
          String numero2;
          String message;
        //----------------------------------------------------------------------
        
        numero1 = JOptionPane.showInputDialog("Digite um Número Inteiro");
        numero2 = JOptionPane.showInputDialog("Digite um Número Inteiro");
        n1 = Integer.parseInt(numero1);
        n2 = Integer.parseInt(numero2);
        soma = n1 + n2;
        message = String.format("A Soma dos Número Digitado = %d", soma);
        JOptionPane.showMessageDialog(null, message);       
        
    }
    
}
