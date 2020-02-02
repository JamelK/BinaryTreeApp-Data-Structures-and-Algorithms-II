// Program Name: Tree
// Programmer: Jamel Kalawi, 1459778
// Assignment Number: HW 4
/* Purpose: This approach is not a balanced tree, actually it has n levels (here n is the number of
nodes). Each level has exactly one letter except the root that is a ‘+’ and the bottom level,
which has two characters */

//import 
import java.io.*;
import java.util.*;

//class to test the binary tree
class main
{
     //main 
     public static void main(String[] args) throws IOException
     {
              int value;
              System.out.print("Enter a string to create a tree:");
              String lString = getStringvalue();
              Tree tree = new Tree(lString);
         

          while(true)
          {
                      System.out.print("Enter 's' to show, 't' to traverse or 'e' to exit: ");
        
                      int usrInput = getCharvalue();
        
                      switch(usrInput)
                      {
        
                      case 's':
        
                           tree.displayTree();
                           break;
        
                      case 't':
        
                           System.out.print("Enter 1 for Prefix, 2 for Infix, or 3 for Postfix: ");    
                           value = getIntval();  
                           tree.traverse(value);        
                           break;
        
                      case 'e':
        
                           System.exit(0);
        
                           break;
        
                      default:
        
                           System.out.print("Invalid entry");

              }

          }

     }

     //method to read user's input
     public static String getStringvalue() throws IOException
     {

         InputStreamReader inStr = new InputStreamReader(System.in);

          BufferedReader bRdr = new BufferedReader(inStr);

          String loclStrng = bRdr.readLine();

          return loclStrng;

     }

    

     //method to get first character of user's input
     public static char getCharvalue() throws IOException
     {

          String loclStrng = getStringvalue();
          return loclStrng.charAt(0);

     }

    

     //method to get the integer values form user input
     public static int getIntval() throws IOException
     {

          String loclStrng = getStringvalue();
          return Integer.parseInt(loclStrng);

     }

}