/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.manipulator;

import java.util.Scanner;

/**
 *
 * @author Devya
 */
public class StringManipulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Favorite city name
        System.out.print("What is your favorite city? ");
        
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        
        String upper = city.toUpperCase();
        String lower = city.toLowerCase();
        int size = city.length();
        char letter = city.charAt(0);
        
        // City upper class
        System.out.println("The name in upper case " + upper);
        // Display of city lower class
     System.out.println("The name in lower case " + lower);
     // The length of the city
     System.out.println(" The number of characters: " + size);
     // The city first letter
     System.out.println(" The first character of city " + letter);

        
    }
    
}
