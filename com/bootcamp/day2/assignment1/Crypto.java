package com.bootcamp.day2.assignment1;

/**
 * @author Jeyashree
 * @s
 */

public class Crypto {
    public String normalizeText(String text){
        // Remove white spaces
        // Remove special characters
       text = text.replaceAll("[^a-zA-Z]", "");
        //Turn all lower-case letters into upper-case letters
        return text.toUpperCase();
    }

    public String ObifyText(String text){
        // insert the letters OB in front of the vowels (A, E, I, O, U)
        // JAVAISFUN => JOBAVOBAOBISFOBUN

        // String is a character array
        // Check caracter by character and concatenate
        text = text.replaceAll("O", "OBO");

        text = text.replaceAll("A", "OBA");
        text = text.replaceAll("E", "OBE");
        text = text.replaceAll("I", "OBI");

        text = text.replaceAll("U", "OBU");

        return text;

    }

    public String obifyTextUsingForIf (String text){
        String result = "";

        for (int i=0; i<text.length(); i++){
            if ((text.charAt(i) == 'A')||
                    (text.charAt(i) == 'E') ||
                    (text.charAt(i) == 'I') ||
                    (text.charAt(i) == 'O') ||
                    (text.charAt(i) == 'U')){
                result += "OB";
            }
            result += text.charAt(i);
        }
        return result;
    }


    public String obifyTextUsingForEachArray (String text){
        String result = "";

        Character[] vowels = {'A', 'E', 'I', 'O', 'U'};
        // Iterate char by char
        for (int i = 0; i < text.length(); i ++) { // For loop
            // Iterate vowel in vowels array
            for (char vowel :  vowels){// For each
                //compare with the char in vowels array
                if (text.charAt(i) == vowel) {
                    result += "OB"; //Insert OB infront
                    break;
                }
            }
            result  +=text.charAt(i);
        }
        return result;
    }
    /**
     *
     * @param text
     * @param shiftValue
     * @return
     */
    public String caesarify(String text, int shiftValue){
        //Java is Fun! => JAVAISFUN => JOBAVOBAOBISFOBUN
        // Shift it by 2 letters
        // J => L (K, L)
        // O => Q (P, Q)
        // B => D (C, D)
        // A => C (B, C)
        // JOBAVOBAOBISFOBUN => LQDCXQDCQDKUHQDWP
        String result = "";
        int charAscii;
        // Iterate char by char
        for (int i = 0; i < text.length(); i ++) { // For loop
            charAscii = text.charAt(i) + shiftValue;

            // compare with upper boundary (Z) and minus 26
            if (charAscii > 90)
                charAscii -= 26;
                // compare with lower boundary (A) and plus 26
            else if (charAscii < 65)
                charAscii += 26;
            result += (char) charAscii;
        }
        return result;
    }

    public String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public String groupify(String text, int groupValue){
        // LQDCXQDCQDKUHQDWP
        // Group by 3 characters
        // Any missing letters in the group should be patch with x
        // LQD CXQ DCQ DKU HQD WPx

        String result = "";
        int remainder;

        // Identify & patch the missing characters in the last group

        remainder = text.length() % groupValue; //Results the number of characters
        // in the last group
        while ((remainder < groupValue) && remainder > 0 ){
            text +="x"; //Patch it with 'x'
            remainder++;
        }

        //Take sub string based on the group value
        for (int i = 0; i <text.length(); i+=groupValue) {
            result += text.substring(i, i+groupValue) + " ";
        }
        return result;

    }

    public String encryptString(String text, int shiftValue, int groupValue){
        // Normalise
        // Obify
        // caesarify
        //groupify
        text = normalizeText(text);
        text = obifyTextUsingForIf(text);
        text = caesarify(text,shiftValue);
        text = groupify(text,groupValue);
        //return groupify(caesarify(obifyTextUsingForIf(normalizeText(text)), shiftValue),groupValue);
        return text;
    }

    public String decryptString(String text, int shiftValue){
        //text = ungroupify(text); // remove white spaces and x
        System.out.println(text);
        text = caesarify(text, shiftValue*(-1));
        System.out.println(text);
       // text = unobifyText(text); // remove all OB
        return text;
    }



}
