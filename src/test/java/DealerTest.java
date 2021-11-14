import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
        deck.populate();
        dealer = new Dealer(deck);
    }

    @Test
    public void canDeal() {
        assertEquals("ACE of CLUBS", dealer.deal().stringify());
    }

    @Test
    public void canShuffleDeck() {
        dealer.shuffle();
        assertNotEquals("ACE of CLUBS",dealer.deal().stringify());
    }

}
