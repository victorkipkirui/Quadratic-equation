import java.util.Scanner;
public class Quadratic{
     public static void main (String[]args) {
          Scanner scanner= new Scanner(System.in);
          System.out.println("enter value of a: ");
          double a = scanner.nextDouble();
          System.out.println ("enter value of b : ");
          double b = scanner.nextDouble();
          System.out.println("enter value of c : ");
          double c = scanner.nextDouble ();
          double x;
          double value1;
          double value2;
          x = Math.pow (b, 2) -4*a*c;
          if(x >= 0) {
               value1 = (b+Math.sqrt (x))/ (2*a);
               value2 = (-b-Math.sqrt (x)/2*a);
               if(value1==value2){
                    System.out.println ("the root are equal");
                    System.out.println ("the value is : "+value1);
               }
               else {
                    System.out.println ("Root 1 is :" + value1);
                    System.out.println ("Root 2 is :" + value2);
               }
          }
          else if(x<0){
               System.out.println("There are no real names");
          }
     }
}