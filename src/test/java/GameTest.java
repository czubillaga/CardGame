import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;

    @Before
    public void before() {
        game = new Game();
        player1 = new Player("Carlos");
        player2 = new Player("Oscar");
    }

    @Test
    public void startsWithPopulatedDeck() {
        assertEquals(52, game.getDeckCount());
    }

    @Test
    public void startsWithDealer() {
        assertEquals("DEALER", game.getDealer().getName());
    }

    @Test
    public void canAddPlayers() {
        game.addPlayer(player1);
        assertEquals(1, game.playerCount());
    }

    @Test
    public void canReturnWinnerForSingleCardGame() {
        game.addPlayer(player1);
        game.addPlayer(player2);
        Dealer dealer = game.getDealer();
        player1.addToHand(dealer.deal());
        player2.addToHand(dealer.deal());
        game.play();
        assertEquals("Oscar", game.getWinner().getName());
    }
}
