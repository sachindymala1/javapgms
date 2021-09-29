package com.company;
//super class->add,mul,div,sub
//child class->odd or even,isprimenum.?,sqr.
//input class->options(switch),main().
//conditions->cal is developed ->extend cal
import java.util.*;

class cal
{
    int addition(int a, int b)
    {
        return a+b;
    }
    float multiplication(int a,int b)
    {
        return a*b;
    }
    int subtraction(int a, int b)
    {
        return b - a;
    }
    float division(int a, int b) {
        return b / a;
    }
}
class extendcal extends cal
{
   void oddoreven(int a,int b) {
       if (a == 0) {
           System.out.println("First number is zero ");
       } else if (a % 2 == 0) {
           System.out.println("First number is even ");
       } else {
           System.out.println("First number is odd");
       }
       if (b == 0) {
           System.out.println(b+" number is zero ");
       } else if (b % 2 == 0) {
           System.out.println(b+" number is even ");
       } else {
           System.out.println(b+" number is odd");
       }
   }
       void isprime(int a,int b){
          int k=0,l=0;
           for (int i=2;i<=a/2;i++)
           {
               k=1;
               break;
           }

       if (k==1)
           System.out.println(a+" number is prime number.");
       else
           System.out.println(a+" number is  not a prime number.");
       for (int j=2;j<=b/2;j++)
       {
           l=1;
           break;
       }
       if (l==1)
           System.out.println(b+" number is prime number.");
       else
           System.out.println(b+" number is not a prime number.");

       }
       void squareofnum(int a,int b){
       System.out.println("Square of "+a+"is" +a*a);
       System.out.println("Square of "+b+"is" +b*b);

       }

}
class input extends extendcal {
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("enter your choice 1 addition \n 2.subtraction \n 3.multiplication  \n 4.division \n 5.to find odd or eve \n 6.to find out whether numbers are prime numbers\n 7. find squares of number \n 8.loop");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("sum is " +addition(a, b));
                break;
            case 2:
                System.out.println("difference is " +subtraction(a,b));
                break;
            case 3:
                System.out.println("product is " +multiplication(a,b));
                break;
            case 4:
                System.out.println("division is " +division(a,b));
                break;
            case 5:
                oddoreven(a,b);
                break;
            case 6:
                isprime(a,b);
                break;
            case 7:
                squareofnum(a,b);
                break;
            case 9:
                input();
                break;


        }
    }
}
public class Main
{
    public static void main(String args[])
    {

        input in=new input();
        in.input();
    }
}
