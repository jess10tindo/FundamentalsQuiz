package com.dtcc.quiz;

import java.sql.SQLOutput;

public class LoopFun {
    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number){
        int factorial = number;
        for(int i = number-1; i > 0; i--){
            factorial = i * factorial;
        }
        return factorial;
    }

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
        String acronym = "";
        //phrase.toUpperCase();
        String[] phraseArray = phrase.split(" ");
        char[] acronymArray = new char[phraseArray.length];
        for(int i = 0; i< phraseArray.length; i++ ) {
            acronymArray[i] = phraseArray[i].charAt(0);
            acronym += acronymArray[i];
        }
        return acronym.toUpperCase();
    }

    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     *  'a' => 'd'
     *  'w' => 'z'
     *  'x' => 'a'
     *  'y' => 'b'
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {
        String encryption = "";

        int originalLetter;
        char encryptedLetter = 0;
        String encryptedWord = "";

        for(int i = 0; i < word.length(); i++){
            int shift = 3;
            originalLetter = (int)word.charAt(i);
            if(originalLetter > 64 && originalLetter < 90){
                if(originalLetter >= (90-shift)){
                    encryptedLetter = (char)(65 + (shift-(90 - originalLetter)));
                }
                else{
                    encryptedLetter = (char)(originalLetter + shift);
                }
            }
            if(originalLetter > 96 && originalLetter < 123){
                if(originalLetter >= (123-shift)){
                    encryptedLetter = (char)(97 + (shift-(123- originalLetter)));
                }
                else{
                    encryptedLetter = (char)(originalLetter + shift);
                }
            }
            encryptedWord += encryptedLetter;
        }
        return encryptedWord;
    }

}
