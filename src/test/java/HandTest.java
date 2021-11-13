import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Hand hand;

    @Before
    public void before() {
        hand = new Hand();
    }

    @Test
    public void willHandleAceInBlackJack() {
        Card ace = new Card(Suit.SPADES, Rank.ACE);
        Card jack = new Card(Suit.CLUBS, Rank.JACK);
        hand.addCard(ace);
        hand.addCard(jack);
        assertEquals(21, hand.getRankTotal());
    }
}
