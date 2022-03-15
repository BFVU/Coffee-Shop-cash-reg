//******************************************************************** 
//    NIT2112 Object Orientated Programming
//    Student id: s3892805
//    Name: Bryan
//
//    march 2022
//******************************************************************** 
//******************************************************************** 
//  The public class Product
// • Product(String name) //constructor initialises data attributes 
// • setPrice(int cents) //sets Product price in cents.  
// • addToTotal(int amount)  //adds current sale to total, recorded in cents
// • getName( ) //returns the product name 
// • getPrice( ) //returns product's price in cents 
// • getTotal( ) //returns day's sales in cents  
// • reset( ) //reset attributes (required by GUI app only)
//
//******************************************************************** 

import java.util.*;
import java.text.NumberFormat; //import number formatting

public class Product 
{ 
   //-----------------------------------------------------------------
   // initalize global variables
   //-----------------------------------------------------------------
   private String name;  
   private int cents;
   private int total;
   int addToTotal;   
   
   //----------------------------------------------------------------- 
   //  Constructor: 
   //  Sets up Product object with the specified Name argument
   //----------------------------------------------------------------- 
   
   public Product (String name) { 
      this.name = name;
   }    
   //----------------------------------------------------------------- 
   //  Returns a string representation of this name 
   //-----------------------------------------------------------------    
      public String toString() { 
      NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
      String description; 
      double displayCurr = cents;
      displayCurr = displayCurr / 100;
      description = fmt.format(displayCurr);
      return description; 
   } 

   //----------------------------------------------------------------- 
   //  Name accessor. 
   //-----------------------------------------------------------------         
   public String getName() { 
      return name; 
   } 
   //----------------------------------------------------------------- 
   //  Name mutator. 
   //----------------------------------------------------------------- 
   public void setName (String name) { 
      this.name = name; 
   }
   //----------------------------------------------------------------- 
   //  Price accessor. 
   //----------------------------------------------------------------- 
   public int getPrice() { 
      return cents; 
   } 
   //----------------------------------------------------------------- 
   //  Price mutator. 
   //----------------------------------------------------------------- 
   public void setPrice (int cents) { 
      this.cents = cents;
   } 
   //----------------------------------------------------------------- 
   //  Used as temp holder for contents of [Case No.-1] array element
   //  added to 1 sale then put back in the same array element
   //
   //  addToTotal accessor.  (getter)
   //----------------------------------------------------------------- 
   public int addToTotal() { 
      return addToTotal; 
   } 
   //----------------------------------------------------------------- 
   //  addToTotal mutator. (setter)
   //----------------------------------------------------------------- 
   public void setToTotal (int addToTotal) { 
      this.addToTotal = addToTotal;   
   }
   //----------------------------------------------------------------- 
   //  Use to hold individual calculated sale total
   //
   //  Total accessor. 
   //----------------------------------------------------------------- 
   public int getTotal() {      
      return total; 
   } 
   //----------------------------------------------------------------- 
   //  Total mutator.  sets getTotal
   //----------------------------------------------------------------- 
   public void setTotal (int total) { 
      this.total = total;   
   }   
} 
