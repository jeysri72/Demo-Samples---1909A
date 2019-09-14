package com.bootcamp.day2.assignment1;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *
 */
public class CryptoDemo {
    public static void main(String[] args) {
        Crypto crypto = new Crypto();
        String text = "Java is Fun!";
        System.out.println("Input your String - ");
        Scanner input = new Scanner(System.in);
        text = input.nextLine();

        System.out.println("Enter your shift value - ");
        int shiftValue = input.nextInt();


        System.out.println("Enter your group value - ");
        int groupValue = input.nextInt();


        System.out.println("Original String = " + text);
        System.out.println("Encrypted String = "+ crypto.encryptString(text, shiftValue,groupValue));
        System.out.println("Decrypted String = " + crypto.decryptString(text,shiftValue));

        /*text = crypto.normalizeText(text);
        System.out.println("Normalized Text = " + text);
        text = crypto.obifyTextUsingForIf(text);
        System.out.println("Obified Text = " + text);
        System.out.println(text);
        text = crypto.caesarify(text, shiftValue);
        System.out.println("Caesarified Text = " + text);

        text = crypto.groupify(text, groupValue);
        System.out.println("Groupified Text = " + text);

        System.out.println("Length of text = " + text.length());
        System.out.println("Character at index 6 = " + text.charAt(6));

        System.out.println(crypto.shiftAlphabet(2));
        System.out.println(crypto.shiftAlphabet(-2));

        // ASCII Value - Integer value for every characters
        // A = 65, B = 66, C = 67 .... Z = 90

        int ascii = text.charAt(6);
        System.out.println("Ascii of F = " + ascii);

        ascii += 5;
        // F => G, H, I, J, K => K
        System.out.println("After shifting 5 characters = " + (char) (ascii));

        ascii -= 6;
        // K => J, I, H, G, F, E => E
        System.out.println("After shifting -6 characters = " + (char) (ascii));

        // Result is > 90 (Z) then minus 26
        // Result is < 65 (A) then plus 26*/

    }
}
