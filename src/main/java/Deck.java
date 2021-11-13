import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public int getCardCount() {
        return this.cards.size();
    }

    public void populate() {
        for(int suit = 0; suit < 4; suit++) {
            for(int rank = 0; rank < 13; rank ++) {
                Card card = new Card(Suit.values()[suit], Rank.values()[rank]);
                this.addCard(card);
            }
        }
    }

    public Card deal() {
        return this.cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
