package jp.ac.uryukyu.ie.e245749;

public class Main{
    public static void main(String[] args) {
        GameMaster master = new GameMaster();
        Player player = new Player();
        Deck deck = new Deck();
        for(int i=0; i<2; i++){
            master.draw(deck);
            player.draw(deck);
        }
        master.firstShowCard();
        player.showcard();
    }
}
