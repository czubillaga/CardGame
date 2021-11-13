import java.util.ArrayList;

public class Game {

    private Deck deck;
    private Dealer dealer;
    private ArrayList<Player> players;

    public Game() {
        this.deck = new Deck();
        this.deck.populate();
        this.dealer = new Dealer(this.deck);
        this.players = new ArrayList<Player>();
    }

    public int getDeckCount() {
        return this.deck.getCardCount();
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int playerCount() {
        return this.players.size();
    }


}
