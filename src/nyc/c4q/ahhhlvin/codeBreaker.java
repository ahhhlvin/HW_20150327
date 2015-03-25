package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/24/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */

import java.util.Scanner;

public class codeBreaker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a message: ");
        String messageOne = input.nextLine();
        System.out.println("Please enter another message: ");
        String messageTwo = input.nextLine();


        System.out.println(codeBreaker(messageOne, messageTwo));
    }

    public static boolean codeBreaker(String one, String two) {


        if (CaesarCipher.decode(one, 26) == CaesarCipher.encode(two, 26)) {
            return true;
        } else {
            return false;
        }

    }


}




