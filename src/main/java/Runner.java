import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Game game = new Game();

//        System.out.println("Let's Play Black Jack! Enter your name: ");
//        Scanner in = new Scanner(System.in);
//        String name = in.nextLine();

        Player player = new Player("Player");
        game.addPlayer(player);

        Dealer dealer = game.getDealer();
        dealer.shuffle();

        player.addToHand(dealer.deal());
        dealer.addToHand(dealer.deal());
        player.addToHand(dealer.deal());
        dealer.addToHand(dealer.deal());
        if(dealer.getHand().getRankTotal() < 16) {
            dealer.addToHand(dealer.deal());
        }


        System.out.println("You were dealt: " + player.getHand().stringify());
        System.out.println("The dealer was dealt: " + dealer.getHand().stringify());

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
