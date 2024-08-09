package basic;

import java.util.Scanner;

public class relational_exp {
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a=myScanner.nextInt();
        System.out.println("Enter value of b:");
        int b=myScanner.nextInt();
        if (a==b) {
            System.out.println("both are equivlaent");
        }
        if(a!=b)
        {
            System.out.println("both arenot equivalent");
        }
        if (a<b) {
            System.out.println("a is less than b");
        } 
        if (a>b) {
            System.out.println("b is less than a");
        } 
        if (a<=b) {
            System.out.println("a is less and eqaul to b");
        } 
        if (a>=b) {
            System.out.println("b is less and eqaul to a");
        } 
     }
}
