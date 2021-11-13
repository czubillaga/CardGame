public class Game {

    private Deck deck;

    public Game() {
        this.deck = new Deck();
        this.deck.populate();
    }

    public int getDeckCount() {
        return this.deck.getCardCount();
    }
}
