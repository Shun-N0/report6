package jp.ac.uryukyu.ie.e245749;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class sumTest {
    // 関数sum()の足し算が正しく行えているのかを確認
    @Test
    public void testsum() {
        Deck deck = new Deck();
        Player player = new Player();
        player.draw(deck);

        int sum = 0;
        for(int i=0; i<player.myCardArrayList.size(); i++){
            if(player.myCardArrayList.get(i) == "A"){
                sum += 1;
            }else if (player.myCardArrayList.get(i) == "J" || player.myCardArrayList.get(i) == "Q" || player.myCardArrayList.get(i) == "K") {
                sum += 10;
            } else {
                    sum += (Integer) player.myCardArrayList.get(i);
            }    
        }   
        
        // sumはmyCardArrayListの合計、player.sumは関数sum()を使って計算したもの
        assertEquals(sum, player.sum);
    }
}