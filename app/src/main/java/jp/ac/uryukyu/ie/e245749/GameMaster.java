package jp.ac.uryukyu.ie.e245749;

public class GameMaster extends Player {

    GameMaster(){
    }

    @Override
    void showcard() {
        System.out.println("・ゲームマスター;" +myCardArrayList);
    }
    
    void firstShowCard(){
        System.out.println("・ゲームマスター:[" + myCardArrayList.get(0) + "]");
    }

    @Override
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