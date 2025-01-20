package jp.ac.uryukyu.ie.e245749;

import java.util.ArrayList;

public class Deck {//山札を作るクラス
    ArrayList<Object> playingCards;

    Deck(){
        playingCards = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            playingCards.add("A");
            for(int j = 2; j <= 10; j++){
            playingCards.add(j);
            }
            playingCards.add("J");
            playingCards.add("Q");
            playingCards.add("K");
        }
    }
}