import java.util.ArrayList;

public class Hand extends Deck{


    public Hand() {
        super();
    }

    public String stringify() {
        String handString = new String();
        ArrayList<Card> cards = this.getCards();

        for(Card card: cards) {
            handString += card.stringify() + "\n";
        }

        return handString;
    }

    public int getRankTotal() {
        int total = 0;
        ArrayList cards = this.getCards();
        for(Object object: cards) {
            Card card = (Card) object;
            total += card.getRankValue();
        }

        if(this.containsAce() && total + 10 <= 21){
            total += 10;
        }

        return total;
    }

    public boolean containsAce() {
        boolean contA = false;
        for(Card card: this.cards) {
            if(card.getRank() == Rank.ACE) {
                contA = true;
            }
        }
        return contA;
    }

}
