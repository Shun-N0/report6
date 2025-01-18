package jp.ac.uryukyu.ie.e245749;
import java.util.ArrayList;
import java.util.Scanner;

public class CommandSelector {
    ArrayList<String> commands;
    Scanner scanner;

    CommandSelector() {
        scanner = new Scanner(System.in);
        commands = new ArrayList<>();
    }

    int waitForUsersCommand_draw(String name) {
        System.out.print(name + "のターンです\nカードをひきますか:\n 0:ひく\n 1:ひかない\n");

        // ユーザーから整数を入力として受け取る
        while(true) {
            try {
                // 入力が整数かどうか確認
                if (scanner.hasNextInt()) {
                    int draw_index = scanner.nextInt();
                    scanner.nextLine();  

                    if (draw_index == 0 || draw_index == 1) {
                        return draw_index;
                    } else {
                        System.out.println("無効な入力です。0または1を入力してください。");
                    }
                } else {
                    System.out.println("無効な入力です。整数を入力してください。");
                    scanner.nextLine(); 
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("無効な入力です。整数を入力してください。");
                scanner.nextLine();  
            }
        }
    }

    int waitForUsersCommand_start() {
        // ユーザーに入力を促すメッセージ
        System.out.print("何人でプレーしますか？");
            
        // ユーザーから整数を入力として受け取る
        while(true) {
            try{
                int numPlayers = scanner.nextInt();
                if (numPlayers >= 1) {
                    return numPlayers;
                } else {
                    System.out.println("プレイヤーは1人以上でなければなりません。");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("無効な入力です。整数を入力してください。");
                scanner.nextLine();  
            }
        }
    }
}