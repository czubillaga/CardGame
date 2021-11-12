import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(Suit.SPADES, Rank.KING);
    }

    @Test
    public void hasSuitAndRank() {
        assertEquals(Suit.SPADES, card.getSuit());
        assertEquals(Rank.KING, card.getRank());
    }

    @Test
    public void canStringifyCard() {
        assertEquals("KING of SPADES", card.stringify());
    }
}
