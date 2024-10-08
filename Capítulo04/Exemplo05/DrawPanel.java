//Exemplo 05 - Capítulo 04
//Figura 4.18
//Method GUI 
//Autor: Deitel
//Data of Edition: 09/SET24 - 15h45
//Flávio Alencar

// Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel 
{
    //Desenha um X a partir dos cantos do Painel
    public void paintComponent(Graphics g)
    {
        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);
        
        int width = getWidth();     //largura total
        int height = getHeight();   //altura total
        
        // desenha uma linha a partir do canto superior esquerdo até o inferior direito
        g.drawLine(0,0, width, height);
        
        // desenha uma linha a partir do canto inferior esquerdo até o superior direito
        g.drawLine(0, height, width,0);
        
    }
   
}
