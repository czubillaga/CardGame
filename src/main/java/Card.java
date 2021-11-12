public class Card {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public String stringify() {
        return this.rank.toString() + " of " + this.suit.toString();
    }
}
