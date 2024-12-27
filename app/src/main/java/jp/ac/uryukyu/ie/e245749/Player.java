package jp.ac.uryukyu.ie.e245749;

import java.util.ArrayList;
import java.util.Random;

public class Player{
    ArrayList<Object> myCardArrayList;
 
    Player() {
        this.myCardArrayList = new ArrayList<>();
    }
 
    void draw(Deck deck){
        Random rand = new Random();
        int index = rand.nextInt(deck.playingCards.size());
        myCardArrayList.add(deck.playingCards.get(index));
        deck.playingCards.remove(index);
    }
 
    void showcard() {
        System.out.println("プレイヤー;" +myCardArrayList);
    }
 }