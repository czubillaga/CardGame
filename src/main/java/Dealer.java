public class Dealer extends Player{

    private Deck deck;

    public Dealer(Deck deck) {
        super("DEALER");
        this.deck = deck;
    }

    public Card deal() {
        return this.deck.deal();
    }

    public void shuffle() {
        this.deck.shuffle();
    }

    @Override
    public void addToHand(Card card) {
        this.getHand().addCard(card);
        if(this.getHand().getCards().size() > 1) {
            System.out.println(this.getName() + " was dealt a HOLE CARD");
        } else {
            System.out.println(this.getName() + " was dealt the " + card.stringify());
        }
    }

}
