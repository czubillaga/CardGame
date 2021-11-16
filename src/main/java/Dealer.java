public class Dealer extends Player{

    private Deck deck;
    private Card holeCard;

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
        if(this.getHand().getCardCount() == 2) {
            this.holeCard = this.getHand().getLastCard();
            System.out.println(this.getName() + " was dealt a HOLE CARD");
            System.out.println();
        } else {
            System.out.println(this.getName() + " was dealt the " + card.stringify());
            System.out.println();
        }
    }

    @Override
    public void printHand() {
        String handString = this.getName() + "'s hand: \n" ;
        for(Object card: this.getCards()) {
            if(this.getCards().indexOf(card) == 1) {
                handString += "A HOLE CARD\n";
            } else {
                handString += ((Card) card).stringify() + "\n";
            }
        }
        System.out.println(handString);
    }

    public Card getHoleCard() {
        return this.holeCard;
    }

}
