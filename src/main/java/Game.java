public class Game {

    private Deck deck;
    private Dealer dealer;

    public Game() {
        this.deck = new Deck();
        this.deck.populate();
        this.dealer = new Dealer(this.deck);
    }

    public int getDeckCount() {
        return this.deck.getCardCount();
    }

    public Dealer getDealer() {
        return this.dealer;
    }


}
