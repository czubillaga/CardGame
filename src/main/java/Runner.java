public class Runner {
    public static void main(String[] args) {

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");
        Player player4 = new Player("Player 4");

        Game game = new Game();

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.addPlayer(player4);

        Dealer dealer = game.getDealer();
        dealer.shuffle();

        player1.addToHand(dealer.deal());
        player2.addToHand(dealer.deal());
        player3.addToHand(dealer.deal());
        player4.addToHand(dealer.deal());

        System.out.println("Player 1 was dealt the " + player1.getHand().deal().stringify());
        System.out.println("Player 2 was dealt the " + player2.getHand().deal().stringify());
        System.out.println("Player 3 was dealt the " + player3.getHand().deal().stringify());
        System.out.println("Player 4 was dealt the " + player4.getHand().deal().stringify());

    }
}
