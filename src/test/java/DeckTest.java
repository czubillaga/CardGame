import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void canAddCardsToDeck() {
        Card card = new Card(Suit.SPADES, Rank.KING);
        deck.addCard(card);
        assertEquals(1, deck.getCardCount());
    }

    @Test
    public void canPopulateDeck() {

    }
}
