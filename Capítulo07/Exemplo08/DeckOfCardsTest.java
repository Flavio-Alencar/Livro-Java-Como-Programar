//Exemple 08 - Chapter 07
//Representa um baralho
//Figura 7.10
//Method: Array 
//Author: Deitel
//Date of Edition: 28/SET24 - 11h35 AM  
//Flávio Alencar

public class DeckOfCardsTest
{
    public static void main (String[] args)
    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();
        
        for (int i = 1; i <= 52; i++)
        {
            System.out.printf("%19s", myDeckOfCards.dealCard());
            
            if (i % 4 ==0)
            {
                System.out.println();
            }
        }
    }
}
