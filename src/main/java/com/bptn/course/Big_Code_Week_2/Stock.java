package com.bptn.course.Big_Code_Week_2;

public class Stock {
	// Create instance variables 
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

   // Constructor
 public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase(); // Convert ticker symbol to uppercase
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
 
     // Initialize percentChange to 0 and calculate marketCap
     this.percentChange = 0.0;
     this.marketCap = (long) price * totalShares;
 }
 
          // Create the methods
       // Method to adjust stock price
          public void adjustPrice(int change) {
             // Add change to current price
             price += change;

              // Calculate the percentChange (change / current price) * 100
     percentChange = ((double) change / price) * 100;

     // Update marketCap
     marketCap = (long) price * totalShares;
 }
    
     // toString method to format and display the stock information
 public String toString() {
     return "Ticker Symbol: " + tickerSymbol + "\n" +
            "Company: " + companyName + "\n" +
            "Current Price: $" + price + " (" + percentChange + "%)\n" +
            "Market Cap: $" + marketCap;

 }   
 
 // Don't modify the code below:
 public static void main(String[] args) {
     Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
     System.out.println(stock);
     stock.adjustPrice(20);
     System.out.println(stock);
 }

}










