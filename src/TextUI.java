import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;
public class TextUI {

    public class TextUI {
        static Scanner scan = new Scanner(System.in);

        public String getInput(String msg){
            System.out.println(msg);
            String input = scan.nextLine();
            return input;

        }
        public String getInput(String msg,  ArrayList options){
            System.out.println(msg);

            for(int i = 0; i < options.size(); i++){
                System.out.println(i+1 + " " + options.get(i));
            }

            String input = scan.nextLine();

            return input;
        }


    }
}
