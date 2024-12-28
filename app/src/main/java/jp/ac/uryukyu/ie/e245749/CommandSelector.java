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

    void addCommand(String command_name) {
        commands.add(command_name);
    }

    int waitForUsersCommand(String name) {
        // ユーザーに入力を促すメッセージ
        System.out.print(name + "のターンです\nカードをひきますか:\n 0:ひく\n 1:ひかない\n");
            
        // ユーザーから整数を入力として受け取る
        while(true) {
            int draw_index = scanner.nextInt();

            if (draw_index == 0 || draw_index == 1) {
                return draw_index;
            }   
        
        // Scannerを閉じる（リソースの解放）
        scanner.close();
        }
    }
}
