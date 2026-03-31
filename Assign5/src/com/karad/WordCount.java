package com.karad;
public class WordCount {
    public static void main(String[] args) {
        String str = "   Java is very easy   ";

        str = str.trim(); 
        String[] words = str.split(" ");

        System.out.println("Number of words: " + words.length);
    }
}