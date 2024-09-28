//Exemple 08 - Chapter 07
//Representa um baralho
//Figura 7.10
//Method: Array 
//Author: Deitel
//Date of Edition: 28/SET24 - 11h35 AM  
//Flávio Alencar

import java.security.SecureRandom;

public class DeckOfCards
{
    //                              Variables
    //--------------------------------------------------------------------------
    private Card [] deck;                          //Array de objetos Card
    private int currentCard;                    //Índice da proxima Card a ser distribuida
    private static final int NUMBER_OF_CARDS = 52; //Numero de cartas
    //--------------------------------------------------------------------------
    
    //Gerador de número aleatório
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    //Construtor preenche baralho de cartas
    public DeckOfCards()
    {
        String[] faces = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete",
        "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
        String[] suits = {"Copas", "Ouro", "Paus", "Espada"};
        
    deck = new Card[NUMBER_OF_CARDS];
    currentCard = 0;
    
    for (int count = 0; count < deck.length; count++)
    {
        deck[count] = new Card(faces[count % 13], suits[count / 13]);        
    }
    
    }
        
    public void shuffle()
    {
        currentCard = 0;
        
        for(int first = 0; first < deck.length; first++)
        {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    
    public Card dealCard()
    {
        if (currentCard < deck.length)
        {
            return deck[currentCard++];
        }
        else
        {
            return null;
        }
    
    }
    
}
