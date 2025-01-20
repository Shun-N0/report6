package jp.ac.uryukyu.ie.e245749;

import java.util.ArrayList;
import java.util.Random;

public class Player{//プレイヤーのクラス
    String name;
    int sum;
    ArrayList<Object> myCardArrayList;
 
    Player(String name) {
        this.name = name;
        this.sum = 0;
        this.myCardArrayList = new ArrayList<>();
    }
 
    //山札からカードを引いて、手札の合計を保存するメソッド
    void draw(Deck deck){
        Random rand = new Random();
        int index = rand.nextInt(deck.playingCards.size());
        myCardArrayList.add(deck.playingCards.get(index));
        sum(deck.playingCards.get(index));
        deck.playingCards.remove(index);
    }
 
    //その時の手札を全て表示するメソッド
    void showcard() {
        System.out.println("・" + name + ":" +myCardArrayList);
    }

    //プレイヤーが引きたいだけ引くためのメソッド
    void act(Deck deck) {
        showcard();
        var command_selector = new CommandSelector();
        boolean bool = true;
        while (bool) {
            var command_number = command_selector.waitForUsersCommand_draw(name);
            if(command_number == 0){
                draw(deck);
                showcard();
                if(sum > 21){
                    System.out.println("・" + name + "の合計：" + sum);
                    System.out.println("バースト！！！\n" + name + "の負けです\n");
                    bool = false;
                }
            }else{
                showcard();
                if(myCardArrayList.contains("A") && sum <= 11){
                    sum += 10;
                }
                System.out.println("・" + name + "の合計：" + sum + "\n");
                bool = false;
            }
        }
    }

    //手札の合計を計算するメソッド
    int sum(Object card){
        if(card == "A"){
            sum += 1;
        }else if (card == "J" || card == "Q" || card == "K") {
            sum += 10;
        } else {
                sum += (Integer) card;         
        }
        return sum;
    }

    //手札とその合計を表示するためのメソッド
    void result(){
        System.out.println(name + ": " + sum + "  " + myCardArrayList);
    }
 }