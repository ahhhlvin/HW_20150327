package nyc.c4q.ahhhlvin;
/*
*
* Access Code 2.1
* Alvin Kuang
* 3.23.2015
*
* Collaborated with @hyunje0 &  @alizinha
*
*/

import java.util.Scanner;

public class uniqueCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a word: ");
        String S = input.next();
        System.out.println(uniqueCharacters(S));

    }

    // converts entered String into a String of characters that occur only ONCE within the entered String
    public static String uniqueCharacters(String S) {


        S = S.toLowerCase();

        String S2 = "" + S.charAt(0);

        for (int i = 0; i < S.length(); i++) {

            String checkLetter = S.substring(i, i+1);

            if (S2.contains(checkLetter)) {
                continue;
            } else {
                S2 = S2 + checkLetter;
            }
        }


        return S2;

    }

}
