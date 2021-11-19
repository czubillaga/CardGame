import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        BlackJack game = new BlackJack();
        Dealer dealer = game.getDealer();
        Player player = new Player("Player");
        game.addPlayer(player);
        dealer.shuffle();

        System.out.println("Let's Play BlackJack!");
        System.out.println();

        player.addToHand(dealer.deal());
        dealer.addToHand(dealer.deal());
        player.addToHand(dealer.deal());
        dealer.addToHand(dealer.deal());

        player.printHand();
        dealer.printHand();

        System.out.println("Would you like to STICK or TWIST?");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine().toLowerCase();
        System.out.println();

        if(Objects.equals(choice, "twist")) {
            player.addToHand(dealer.deal());
            System.out.println("Dealer's HOLE CARD was the " + dealer.getHoleCard().stringify());
            while(dealer.getRankTotal() < 16) {
                System.out.println("Dealer Twists");
                dealer.addToHand(dealer.deal());
            }

        } else if (Objects.equals(choice, "stick")) {
            System.out.println("Dealer's HOLE CARD was the " + dealer.getHoleCard().stringify());
            while(dealer.getRankTotal() < 16) {
                System.out.println("Dealer Twists");
                dealer.addToHand(dealer.deal());
            }
        }


        game.playBlackJack();
        System.out.println();
        System.out.println(game.getWinner().getName() + " wins!");


    }
}
