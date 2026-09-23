
package ifElseEx;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        boolean outOfStock = true; 
	// numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;
        
if(quantity > 1) { 		itemDesc += "s";
System.out.println(message);
	
}else { 
 
	System.out.println(message);
}
if (outOfStock =quantity <= 0 ) {
	System.out.println(outOfStock);

}else {
	System.out.println(total);

}
        // Declare outOfStock variable and initialize it
        
        
        // Test quantity and modify message if quantity > 1.  
         
        
        // Test outOfStock and notify user in either case.  
        
        
        
    }
    
}


