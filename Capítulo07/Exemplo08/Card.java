//Exemple 08 - Chapter 07
//Representa uma carta do baralho
//Figura 7.9
//Method: Array 
//Author: Deitel
//Date of Edition: 28/SET24 - 11h00 AM  
//Flávio Alencar

public class Card 
{
    //                              Variables
        //----------------------------------------------------------------------
    private final String face;          //Face da carta.
    private final String suit;          //naipe da carta.
    //--------------------------------------------------------------------------
    
    //Construtor de dois argumentos inicializa face e naipe da carta
    public Card (String cardFace, String cardSuit)
    {
        this.face = cardFace;          //Inicializa a face da carta.
        this.suit = cardSuit;          //Inicializa naipe da carta.
    }
    
    //Retorna representação String de Card
    public String toString()
    {
        return face + " of " + suit;
    }
}
