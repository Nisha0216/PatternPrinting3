/*import java.util.Scanner;
public class StarPyramid {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print(" please enter the digit here : ");
          int number = sc.nextInt();
          for(int i=1; i<=number; i++){//lines
               for(int j=1; j<=number-i; j++){//spaces
                    System.out.print("  ");
               }
               for(int j=1; j<=2*i-1; j++){
                    System.out.print("* ");
               }
               System.out.println();
          }
     }
}
  Output
please enter the digit here : 6
          * 
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
* * * * * * * * * * *
           */

 //Approach number 2 for pyramid **
 import java.util.Scanner;
public class StarPyramid {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print(" please enter the digit here : ");
          int n = sc.nextInt();
          int nsp = n-1 , nst =1;
          for(int i=1; i<=n; i++){//lines
               for(int j=1; j<=nsp; j++){
               System.out.print("  ");
          }
          for(int j=1; j<=nst; j++){
               System.out.print("*"+" ");
          }
          nsp--;
          nst += 2;
          System.out.println();
     }
}
}
/*Output
 please enter the digit here : 4
      * 
    * * *
  * * * * *
* * * * * * *
 
 */

               
          
     
  

     
