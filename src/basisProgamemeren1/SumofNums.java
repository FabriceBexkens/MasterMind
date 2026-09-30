/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basisProgamemeren1;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (-1 to quit): ");
        int number = console.nextInt();
int loop = 2;
       do {
    	   sum = sum + number;     // moved to top of loop
           System.out.print("Enter a number (-1 to quit): ");
           number = console.nextInt();
           loop++;
           if(number ==-1) {
        	   loop =11;
           }
       }
       while (loop <=10) ;{
       
        	

        }

        System.out.println("The sum is " + sum);

    }

}
