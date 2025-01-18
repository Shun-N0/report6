package jp.ac.uryukyu.ie.e245749;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        int NumberOfBursts = 0;
        ArrayList<Player> players = new ArrayList<>();
        var command_selector = new CommandSelector();
        var command_number = command_selector.waitForUsersCommand_start();
        for(int i=1; i<=command_number; i++){
            Player player = new Player("プレイヤー" + i);
            players.add(player);
        }
        GameMaster master = new GameMaster("ディーラー");
        Deck deck = new Deck();
        System.out.println("ゲームを開始します");

        for(int i=0; i<2; i++){
            master.draw(deck);
            for(int j=0; j < players.size(); j++){
                players.get(j).draw(deck);
            }
        }
        master.firstShowCard();
        for(int j=0; j < players.size(); j++){
            players.get(j).showcard();
        }
        System.out.println("\n");

        for(int j=0; j < players.size(); j++){
            players.get(j).act(deck);
        }
        
        for(int j=0; j < players.size(); j++){  //バーストした人数を数えるコード
            if(players.get(j).sum >21){
                NumberOfBursts += 1;
            }
        }

        if(NumberOfBursts < players.size()){
            master.act(deck);
            if(master.sum <= 21){
                for(int j=0; j < players.size(); j++){
                    players.get(j).result();
                }
                master.result();
            }
            for(int j=0; j < players.size(); j++){
                master.judge(players.get(j));
            }
        }
    }
}