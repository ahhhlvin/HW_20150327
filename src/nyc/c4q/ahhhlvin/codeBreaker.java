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
        messageOne = CaesarCipher.encode(messageOne, 3);
        System.out.println("Please enter another message: ");
        String messageTwo = input.nextLine();
        messageTwo = CaesarCipher.encode(messageTwo, 8);

        // for testing purposes
        // System.out.println(messageOne);
        // System.out.println(messageTwo);

       // System.out.println(CaesarCipher.decode("fxsfdnh", 3));
       // System.out.println(CaesarCipher.decode("kcxkism", 8));



        System.out.println(codeBreaker(messageOne, messageTwo));
    }

    public static boolean codeBreaker(String one, String two) {


        if (CaesarCipher.decode(one, 3).equals(CaesarCipher.decode(two, 8))) {
            return true;
        } else {
            return false;
        }

    }


}




