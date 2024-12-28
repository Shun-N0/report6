package jp.ac.uryukyu.ie.e245749;

import java.util.ArrayList;
import java.util.Random;

public class Player{
    String name;
    ArrayList<Object> myCardArrayList;
 
    Player() {
        this.name = "プレイヤー";
        this.myCardArrayList = new ArrayList<>();
    }
 
    void draw(Deck deck){
        Random rand = new Random();
        int index = rand.nextInt(deck.playingCards.size());
        myCardArrayList.add(deck.playingCards.get(index));
        deck.playingCards.remove(index);
    }
 
    void showcard() {
        System.out.println("・" + name + ";" +myCardArrayList);
    }

    void act(Deck deck) {
        var command_selector = new CommandSelector();
        boolean bool = true;
        while (bool) {
            var command_number = command_selector.waitForUsersCommand(name);
            if(command_number == 0){
                draw(deck);
                showcard();
            }else{
                bool = false;
            }
        }
    }

 }