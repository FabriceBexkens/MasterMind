package basisProgamemeren1;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish;
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        int price = Integer.parseInt(shirtPrice);
        double tax = Double.parseDouble(taxRate);
        double taxTotal = price*tax;
        System.out.println(taxTotal);

        
        //Try to parse taxRate as an int
        
        
        //Try to parse gibberish as an int
        
    }
    
}
