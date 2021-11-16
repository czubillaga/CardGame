import java.util.ArrayList;

public class Player {

    private Hand hand;
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public void addToHand(Card card) {
        this.hand.addCard(card);
        System.out.println(this.getName() + " was dealt the " + card.stringify());
        System.out.println();
    }

    public Hand getHand() {
        return this.hand;
    }

    public String getName() {
        return this.name;
    }

    public int getRankTotal() {
        return this.getHand().getRankTotal();
    }

    public void printHand() {
        String handString = this.getName() + "'s hand: \n" ;
        for(Object card: this.getCards()) {
            handString += ((Card) card).stringify() + "\n";
        }
        System.out.println(handString);
    }

    public ArrayList getCards() {
        return this.getHand().getCards();
    }
}
