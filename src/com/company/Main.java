package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     /*   Mad Libs
        Create 3 size 5 arrays
        One array should have (1) 5 single word strings, each of which is a noun.
                (2) One array should have 5 single word strings, each of which is an adjective.
                (3) One array should have 5 single word strings, each of which is a verb.
                Note: The Java Util class Random has a nextInt() method that can be used to get a random number from the
                range of zero to the number passed in as a parameter.
                (4) Write a small story that randomly gets words from each array to fill in blank points in the story
                based on the word type.
                Don’t forget to stage and commit changes in git as you go along
        Bonus: Get the words to fill each array by asking the user to supply them. */
        Scanner userInput = new Scanner(System.in);
        String[] nouns = new String[5];
        String[] adjectives = new String[5];
        String[] verbs = new String[5];

        //enter nouns
       System.out.println("Enter 5 Nouns: ");
       for(int i = 0; i < 5; i++)
       {
           nouns[i] = userInput.next();
           //System.out.println("Nouns are: " + noun);
       }//end nouns

        //enter verbs
        System.out.println("Enter 5 verbs: ");
        for(int i = 0; i < 5; i++)
        {
            verbs[i] = userInput.next();
            //System.out.println("Verbs are: " + verb);
        }//end for verbs

        //Enter Adjectives
        System.out.println("Enter 5 adjectives: ");
        for(int i = 0; i < 5; i++)
        {
            adjectives[i] = userInput.next();
            //System.out.println("Adjectives are: " + adjective);
        }//end for adjectives

    //Create the story using random inputs
        Random rnd = new Random();

        for(int i = 0; i< 5; i++){
            int nounIndex = rnd.nextInt(5);
            int verbIndex = rnd.nextInt(5);
            int adjIndex = rnd.nextInt(5);

            //System.out.println(num);
            System.out.println( adjectives[adjIndex] + " " +  nouns[nounIndex] + " " + verbs[verbIndex] );
        }



    } //end main
}//end Main
