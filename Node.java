// Program Name: Tree
// Programmer: Jamel Kalawi, 1459778
// Assignment Number: HW 4
/* Purpose: This approach is not a balanced tree, actually it has n levels (here n is the number of
nodes). Each level has exactly one letter except the root that is a ‘+’ and the bottom level,
which has two characters */
 
//import 

import java.io.*;
import java.util.*;

//Class for tree node
class Node
{
     //variables
     public String stringData;           
     public Node leftChild;
     public Node rightChild;

     // Method to print the tree node

     public void displayNode()
     {
          System.out.print("{" + stringData + "}");
     }

}