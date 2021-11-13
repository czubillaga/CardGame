import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;

    @Before
    public void before() {
        player = new Player("Carlos");
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void canAddCardToHandWhenDealtCard() {
        player.addToHand(deck.deal());
        assertEquals(1, player.getHand().getCardCount());
    }
}
