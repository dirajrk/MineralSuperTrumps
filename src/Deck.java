import java.util.Random;
import java.util.ArrayList;     //Import the necessary file


/**
 * Name: Diraj Ravikumar
 * Student ID: 13255244
 *
 * Date: 09/01/2017
 * GitHub: https://github.com/dirajrk/MineralSuperTrumps
 */
 
public class Deck {
    private ArrayList<Card> deckContent;            //Defining the variable

    Deck(ArrayList<Card> cardlist)
    {
        deckContent = cardlist;
    }           //Constructing the class

    public Card cardDrawn()                     //Card drawn method to draw card from the deck
    {
        int x = new Random().nextInt(deckContent.size());           //Getting a random number
        Card retrieve = deckContent.get(x);
        deckContent.remove(x);                                      //Get the card from the previous random number
        return retrieve;
    }

    public ArrayList<Card> getDeckContent() {
        return deckContent;
    }   //Getter for the array of cards in the deck
}
