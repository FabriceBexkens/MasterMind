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
public class AgeValidity {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

 int Age;
	System.out.println("voer je leeftijd in");
	int Age1 = sc.nextInt();
       boolean drivingUnderAge= (Age1 <=17);
   	System.out.println(drivingUnderAge);

    }
}
