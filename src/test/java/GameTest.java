import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GameTest {

    Game game;
    Player player;

    @Before
    public void before() {
        game = new Game();
        player = new Player("Carlos");
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
        game.addPlayer(player);
        assertEquals(1, game.playerCount());
    }
}
