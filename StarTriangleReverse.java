/*import java.util.Scanner;
public class StarTriangleReverse {
     public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
          System.out.print("please enter the number : ");
          int n = sc.nextInt();
          for(int i=1;i<=n; i++){
               for(int j=1; j<=n; j++){
                    if(i+j<=n) //if(i+j>=n) this one is also valid; 
                    System.out.print("  ");
                    else System.out.print("* ");
               }
               System.out.println();
          }
        }
}
Output
please enter the number : 6
          *
        * *
      * * *
    * * * *
  * * * * *
* * * * * *
 
 */
//2nd approach ********************

import java.util.Scanner;
public class StarTriangleReverse {
     public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
          System.out.print("please enter the number : ");
          int n = sc.nextInt();
          for(int i=1;i<=n; i++){//row
               for(int j=1; j<=n-i; j++){//spaces
                    System.out.print(" " + " ");
               }
               for(int j=1; j<=i; j++){
                   // System.out.print("*"+" ");
                    System.out.print(j+" ");
               }
               System.out.println();
          }
     }
}
/*Output
please enter the number : 6
          * 
        * *
      * * *
    * * * *
  * * * * *
* * * * * *

please enter the number : 5
        * 1 
      * 1 * 2
    * 1 * 2 * 3
  * 1 * 2 * 3 * 4
* 1 * 2 * 3 * 4 * 5

 */

                   