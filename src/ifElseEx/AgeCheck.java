/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifElseEx;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class AgeCheck {
	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int myAge = 19;   // I am 19; let me see if I can drive yet
     myAge = sc.nextInt();

        if (myAge >= 16) {
            System.out.println("I'm old enough to have a driver's license!");
        }
        else {
            System.out.println("I'm not old enough yet... :*(");
        }
    }
}
    

