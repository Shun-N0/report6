package jp.ac.uryukyu.ie.e245749;

public class GameMaster extends Player {

    GameMaster(){
        super();
        this.name = "ゲームマスター";
    }

    void firstShowCard(){
        System.out.println("・" + name + ":[" + myCardArrayList.get(0) + "]");
    }

    @Override
    void act(Deck deck) {
        showcard();
        while (sum < 17){
            draw(deck);
            showcard();
        }
        System.out.println("・" + name + "の合計：" + sum);
    }

    void judge(Player player) {
        if(this.sum > 21){
            System.out.println("バースト！！！\n" + player.name + "の勝ちです！！");
        }else{
            if(sum > player.sum) {
                System.out.println(player.name + "の負けです");
            }else if (sum < player.sum) {
                System.out.println(player.name + "勝ちです！");
            }else{
                System.out.println("引き分けです");
            }
        }
    }
}