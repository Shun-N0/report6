package jp.ac.uryukyu.ie.e245749;

public class GameMaster extends Player {

    GameMaster(){
    }

    void firstShowCard(){
        System.out.println("ゲームマスター:[" + myCardArrayList.get(0) + "]");
    }

    void showcard() {
        System.out.println("ゲームマスター;" +myCardArrayList);
    }
}