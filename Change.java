//******************************************************************** 
//    NIT2112 Object Orientated Programming
//    Student id: s3892805
//    Name: Bryan
//
//    march 2022
//******************************************************************** 
//******************************************************************** 
//  The class Change    
// • Change( ) // constructor initialises data attributes 
// • denChange(int amount) //calculate and store currency denominations 
// • getNotes( ) //returns array of banknote denominations 
// • getCoins( ) //returns array of coin denominations 
//
//******************************************************************** 

import java.util.*;
import java.text.NumberFormat;      //import number formatting

public class Change
{  
   //-----------------------------------------------------------------
   // initalize global variables
   //-----------------------------------------------------------------
   int notes[][] = new int[5][2];
   int coins[][] = new int[6][2];
   int amount;
   NumberFormat nf = NumberFormat.getCurrencyInstance();   

   //----------------------------------------------------------------- 
   //  Constructor: 
   //  Sets up Change object with the specified values
   //----------------------------------------------------------------- 

   public Change () { 
      notes[0][1] = 10000;                // NOTES in descending order: $100
      notes[1][1] = 5000;                 // $50
      notes[2][1] = 2000;                 // $20
      notes[3][1] = 1000;                 // $10
      notes[4][1] = 500;                  // $5
      coins[0][1] = 200;                  // COINS in desc order $2
      coins[1][1] = 100;                  // $1
      coins[2][1] = 50;                   // 50c
      coins[3][1] = 20;                   // 20c
      coins[4][1] = 10;                   // 10c
      coins[5][1] = 5;                    // 5c
   } 
   //-----------------------------------------------------------------
   //  denChange(int amount)calculate and store currency denominations
   //-----------------------------------------------------------------
   public void denChange(int amount) {
      int x = amount;                              // cent   // SHOW LOGIC 
      for (int i = 0; i < notes.length; i++) {
         notes[i][0] = x/notes[i][1];              // integer division, number of notes of specific denomination
         x %= notes[i][1];                         // remainder
      }
      for (int i = 0; i < coins.length; i++) {
         coins[i][0] = x/coins[i][1];              // integer division, number of notes of specific denomination
         x %= coins[i][1];                         // remainder
      }
   }
   //----------------------------------------------------------------- 
   // getNotes( ) //returns array of banknote denominations
   //----------------------------------------------------------------- 
   public int[][] getNotes()
   {
      return notes;
   }
   //----------------------------------------------------------------- 
   // getCoins( ) //returns array of coin denominations 
   //----------------------------------------------------------------- 
   public int[][] getCoins()
   {
      return coins;
   }
   //----------------------------------------------------------------- 
   // Convert cents to $dollars.cents string
   //-----------------------------------------------------------------    
   public String toString() {    
    
      String a = "";
      System.out.println("The change returned to the customer is: ");
      System.out.println("_________________________________________");
      for (int i = 0; i < notes.length; i++) {
         double dispCurr = notes[i][1];
         if (notes[i][0] != 0) {
               System.out.printf("| Number of %7s dollar notes: %4d  | \n",(nf.format(dispCurr/100)),(notes[i][0]));
            }
         }
      for (int i = 0; i < coins.length; i++) {
         double dispCurr = coins[i][1];
         if (coins[i][0] != 0) {
               System.out.printf("| Number of %7s cents  coins: %4d  | \n",(nf.format(dispCurr/100)),(coins[i][0])); 
            }
         }
      System.out.println("|_______________________________________|");
      return a;
   } 

}  

