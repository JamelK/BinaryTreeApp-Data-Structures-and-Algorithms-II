// Program Name: Tree
// Programmer: Jamel Kalawi, 1459778
// Assignment Number: HW 1
/* Purpose: This approach is not a balanced tree, actually it has n levels (here n is the number of
nodes). Each level has exactly one letter except the root that is a ‘+’ and the bottom level,
which has two characters */

//class for Tree

//import 
import java.io.*;
import java.util.*;

class Tree
{
     //root node 
     private Node root; 
     
     //constructor   
     public Tree(String lString)
     {

          root = null;
         
            //Parse input string as array of single letter nodes
            Node[] arrayNode = new Node[lString.length()];

          for(int Strl = 0; Strl < lString.length(); Strl++)
          {

              arrayNode[Strl] = new Node();
              arrayNode[Strl].stringData = String.valueOf(lString.charAt(Strl));

          }

         

          //include + nodes and its children
          Node plcNode = new Node();
          plcNode.stringData = "+";
          plcNode.leftChild = arrayNode[0];
          
          plcNode.rightChild = arrayNode[1];

         

          for(int lj = 2; lj < arrayNode.length; lj++)
          {

              Node newNode = new Node();
              newNode.stringData = "+";
              newNode.leftChild = plcNode;
              newNode.rightChild = arrayNode[lj];
              plcNode = newNode;

          }

          root = plcNode;

     }

  

     //method to perform preFix traversal
     private void preFix(Node loclRoot)
     {

          if(loclRoot != null)
          {

              System.out.print(loclRoot.stringData + " ");
              preFix(loclRoot.leftChild);
              preFix(loclRoot.rightChild);

          }

     }

    

     //method to perform inFix traversal
     private void inFix(Node loclRoot)
     {

          if(loclRoot != null)
          {

              inFix(loclRoot.leftChild);
              System.out.print(loclRoot.stringData + " ");
              inFix(loclRoot.rightChild);

          }

     }

    

     //method to perform postFix traversal
     private void postFix(Node loclRoot)
     {

          if(loclRoot != null)
          {

              postFix(loclRoot.leftChild);
              postFix(loclRoot.rightChild);
              System.out.print(loclRoot.stringData + " ");

          }

     }
     
     //method to perform traversal
     public void traverse(int trvsType)
     {

          switch(trvsType)
          {

              case 1: System.out.print("\nPrefix traversal: ");
    
                       preFix(root);
    
                       break;
    
              case 2: System.out.print("\nInfix traversal: ");
    
                       inFix(root);
    
                       break;
    
              case 3: System.out.print("\nPostfix traversal: ");
    
                       postFix(root);
    
                       break;

          }

          System.out.println("");

     }

    

     //method to display tree 
     public void displayTree()
     {

              Stack<Node> gblStack = new Stack<Node>();
              gblStack.push(root);
              int Blnk = 32;
              boolean isEmpty = false;
    
              System.out.println("|***************************************************************|");

          while(isEmpty==false)
          {

              Stack<Node> loclStack = new Stack<Node>();

              isEmpty = true;

             

              for(int lj = 0; lj < Blnk; lj++)

                   System.out.print(" ");

             

              while(gblStack.isEmpty() == false)

              {

                   Node tmp = gblStack.pop();

                   if(tmp != null)

                   {

                            System.out.print(tmp.stringData);
    
                            loclStack.push(tmp.leftChild);
    
                            loclStack.push(tmp.rightChild);

                       

                        if(tmp.leftChild != null ||

                        tmp.rightChild != null)

                                  isEmpty = false;

                   }

                   else

                   {

                        System.out.print("--");

                        loclStack.push(null);

                        loclStack.push(null);

                   }

                   for(int lj = 0; lj < Blnk*2 - 2; lj++)

                        System.out.print(" ");

              }

              System.out.println();

              Blnk /= 2;

              while(loclStack.isEmpty() == false)

                   gblStack.push( loclStack.pop() );

          }

              System.out.println("|***************************************************************|");

     }

}