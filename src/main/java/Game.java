import java.util.ArrayList;

public abstract class Game {

    private Deck deck;
    private Dealer dealer;
    private ArrayList<Player> players;
    private Player winner;
    private Boolean winnerSet = false;

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

    public void play() {

        Player winnerSoFar = this.players.get(0);
        Card winningCardSoFar = (Card) winnerSoFar.getHand().getCards().get(0);

        for(int index = 1; index < this.players.size(); index++) {
            Player currentPlayer = this.players.get(index);
            Card currentCard = (Card) currentPlayer.getHand().getCards().get(0);
            if(currentCard.getRankValue() > winningCardSoFar.getRankValue()) {
                winnerSoFar = currentPlayer;
                winningCardSoFar = currentCard;
            } else if(currentCard.getRankValue() == winningCardSoFar.getRankValue()){
                if(currentCard.getSuitValue() > winningCardSoFar.getSuitValue()) {
                    winnerSoFar = currentPlayer;
                    winningCardSoFar = currentCard;
                }
            }
        }

        this.setWinner(winnerSoFar);
    }

    public void setWinner(Player player) {
        this.winner = player;
    }

    public Player getWinner() {
        return this.winner;
    }

    public ArrayList getPlayers() {
        return this.players;
    }

}
