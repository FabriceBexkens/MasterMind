
package basisProgamemeren1;

import java.util.Scanner;


public class SquareRootWhile {
    public static void main(String args[])
    {
    	int som= 0;
    	int number= 0;
    	while(number != -1) {
    System.out.print("Type a non-negative integer: ");
     Scanner console = new Scanner(System.in);
	number = console.nextInt();
	som+=number;
    	}
    	 System.out.print(som);
	
    
}
    
}
