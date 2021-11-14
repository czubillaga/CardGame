import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Game game = new Game();
        Dealer dealer = game.getDealer();
        Player player = new Player("Player");
        game.addPlayer(player);
        dealer.shuffle();

        System.out.println("Let's Play BlackJack!");
        System.out.println();
        Scanner in = new Scanner(System.in);

        player.addToHand(dealer.deal());
        dealer.addToHand(dealer.deal());
        player.addToHand(dealer.deal());
        dealer.addToHand(dealer.deal());

        Card holeCard = (Card) dealer.getHand().getCards().get(1);
        Card faceUpCard = (Card) dealer.getHand().getCards().get(0);

        System.out.println("You were dealt: ");
        System.out.println(player.getHand().stringify());
        System.out.println();
        System.out.println("The dealer was dealt: ");
        System.out.println(faceUpCard.stringify() + " and a HOLE CARD");
        System.out.println();

        System.out.println("Would you like to STICK or TWIST?");
        String choice = in.nextLine().toLowerCase();
        System.out.println();

        if(Objects.equals(choice, "twist")) {
            player.addToHand(dealer.deal());
            System.out.println("You were dealt: ");
            System.out.println(player.getHand().stringify());
            System.out.println("Dealer's HOLE CARD was " + holeCard.stringify());
        } else if (Objects.equals(choice, "stick")) {
            System.out.println("Dealer's HOLE CARD was " + holeCard.stringify());
            while(dealer.getHand().getRankTotal() < 16) {
                System.out.println("Dealer Twists");
                dealer.addToHand(dealer.deal());
                System.out.println("Dealer drew " + dealer.getHand().stringify());
            }
        }


        game.playBlackJack();
        System.out.println();
        System.out.println(game.getWinner().getName() + " wins!");

//        Player player1 = new Player("Player 1");
//        Player player2 = new Player("Player 2");
//        Player player3 = new Player("Player 3");
//        Player player4 = new Player("Player 4");
//
//        Game game = new Game();

//        game.addPlayer(player1);
//        game.addPlayer(player2);
//        game.addPlayer(player3);
//        game.addPlayer(player4);
//
//        Dealer dealer = game.getDealer();
//        dealer.shuffle();
//
//        player1.addToHand(dealer.deal());
//        player2.addToHand(dealer.deal());
//        player3.addToHand(dealer.deal());
//        player4.addToHand(dealer.deal());
//
//        Card card1 = (Card) player1.getHand().getCards().get(0);
//        Card card2 = (Card) player2.getHand().getCards().get(0);
//        Card card3 = (Card) player3.getHand().getCards().get(0);
//        Card card4 = (Card) player4.getHand().getCards().get(0);
//
//        System.out.println("Player 1 was dealt the " + card1.stringify());
//        System.out.println("Player 2 was dealt the " + card2.stringify());
//        System.out.println("Player 3 was dealt the " + card3.stringify());
//        System.out.println("Player 4 was dealt the " + card4.stringify());
//
//        game.play();
//
//        System.out.println("");
//        System.out.println(game.getWinner().getName() + " WINS!");

    }
}
