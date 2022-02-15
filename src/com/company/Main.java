package com.company;
import java.util.Locale;
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
        final int INDEX_MAX = 5;
        String[] nouns = new String[INDEX_MAX];
        String[] adjectives = new String[INDEX_MAX];
        String[] verbs = new String[INDEX_MAX];

        //enter nouns
       System.out.println("Enter 5 Nouns: ");
       for(int i = 0; i < INDEX_MAX; i++)
       {
           System.out.print((i+1) + ". ");
           nouns[i] = userInput.next();
           //System.out.println("Nouns are: " + noun);
       }//end nouns

        //enter verbs
        System.out.println("Enter 5 verbs: ");
        for(int i = 0; i < INDEX_MAX; i++)
        {
            System.out.print((i+1) + ". ");
            verbs[i] = userInput.next();
            //System.out.println("Verbs are: " + verb);
        }//end for verbs

        //Enter Adjectives
        System.out.println("Enter 5 adjectives: ");
        for(int i = 0; i < INDEX_MAX; i++)
        {
            System.out.print((i+1) + ". ");
            adjectives[i] = userInput.next();
            //System.out.println("Adjectives are: " + adjective);
        }//end for adjectives

    //Create the story using random inputs
        Random rnd = new Random();

        for(int i = 0; i< INDEX_MAX; i++){
            int nounIndex = rnd.nextInt(INDEX_MAX);
            int verbIndex = rnd.nextInt(INDEX_MAX);
            int adjIndex = rnd.nextInt(INDEX_MAX);

            //System.out.println(num);
            System.out.println( adjectives[adjIndex].toUpperCase() + " " +  nouns[nounIndex].toUpperCase()+
                    " " + verbs[verbIndex].toUpperCase() + "." );
        }



    } //end main
}//end Main
