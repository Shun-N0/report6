package jp.ac.uryukyu.ie.e245749;

public class GameMaster extends Player {//ディーラーのクラス

    GameMaster(String name){
        super(name);
    }

    //ディーラーの最初に引いた一枚目だけを表示するメソッド
    void firstShowCard(){
        System.out.println("・" + name + ":[" + myCardArrayList.get(0) + "]");
    }

    //ディーラーの手札の合計が17を超えるまで引き続けるメソッド
    @Override
    void act(Deck deck) {
        System.out.println(name + "のターンです");
        showcard();
        while (sum < 17){
            draw(deck);
            showcard();
        }
        System.out.println("・" + name + "の合計：" + sum + "\n");
    }

    //ゲームの勝敗を判断するメソッド
    void judge(Player player) {
        if(player.sum <= 21){
            if(this.sum > 21){
                System.out.println(name + "バースト！！！\n" + player.name + "の勝ちです！！");
            }else{
                if(sum > player.sum) {
                    System.out.println(player.name + "の負けです");
                }else if (sum < player.sum) {
                    System.out.println(player.name + "の勝ちです！");
                }else{
                    System.out.println(player.name + "の引き分けです");
                }
            }
        }
    }
}