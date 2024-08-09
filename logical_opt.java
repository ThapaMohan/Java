package basic;

import java.util.Scanner;

public class logical_opt {
    public static void main(String[] args) {
     Scanner myScanner=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a=myScanner.nextInt();
            if (a>10 && a>=20)
            {
                System.out.println("and operator ");
            }
            else if (a>10 || a>=20) {
                System.out.println("or operator");
            }
            else{
                System.out.println("nor operator");
            }
        }
    }