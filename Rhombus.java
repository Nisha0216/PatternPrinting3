import java.util.Scanner;
public class Rhombus {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("please enter a digit here : ");
          int n = sc.nextInt();
          for(int i=1;i<=n; i++){//row
               for(int j=1; j<=n-i; j++){//spaces
                    System.out.print(" "+" ");
               }
               for(int j=1; j<=n; j++){//column
                   System.out.print("* ");
               }
               System.out.println();
          }
     }
     
}
/*Output
 please enter a digit here : 6
          * * * * * * 
        * * * * * *
      * * * * * *
    * * * * * *
  * * * * * *
* * * * * *
 */
 