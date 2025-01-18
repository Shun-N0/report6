package jp.ac.uryukyu.ie.e245749;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class drawTest {
    // プレイヤーがカードを引くとデッキからカードが減ることを確認
    @Test
    public void testPlayerDrawsCard() {
        Deck deck = new Deck();
        Player player = new Player("プレイヤー");
        int initialDeckSize = deck.playingCards.size();
        player.draw(deck);
        
        // プレイヤーがカードを引いた後、デッキのサイズは1枚減るはず
        assertEquals(initialDeckSize - 1, deck.playingCards.size());
    }
}