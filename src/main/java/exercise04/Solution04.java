/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sue Lin
 */

package exercise04;

import java.util.Scanner;

/*
* pseudo code
* Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.
*   -prompt user for a noun and store the string
*   -prompt user for a verb and store the string
*   -prompt user for an adjective and store the string
*   -prompt user for an adverb and store the string
*   -output the madlib that was just created
 */

public class Solution04 {
    public static void main (String[] args)
    {
        System.out.print("Enter a noun: ");
        Scanner scanner = new Scanner(System.in);
        String noun = scanner.nextLine();
        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();
        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
