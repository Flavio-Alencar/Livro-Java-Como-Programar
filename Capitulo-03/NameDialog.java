package Capitulo03;
import javax.swing.JOptionPane;

//Exemplo 05 - Capítulo 03
//Flavio Silvestre de Alencar - 26Jul26 - 21h13
//Descrição: Obtendo a entrada de usuário a partir de um diálogo.
//------------------------------------------------------------------------------

public class NameDialog
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name? ");
        
        String message = String.format("Welcome %s to Java programming!", name);
        JOptionPane.showMessageDialog(null, message);
        
    }
    
}
