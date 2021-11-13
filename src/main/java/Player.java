public class Player {

    private Hand hand;
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public void addToHand(Card card) {
        this.hand.addCard(card);
    }

    public Hand getHand() {
        return this.hand;
    }
}
