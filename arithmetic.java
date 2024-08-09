package basic;
import java.util.Scanner;
public class arithmetic {
public static void main(String[] args){
    Scanner myObj=new Scanner(System.in);
    System.out.println("Enter number:");
    int a=myObj.nextInt();
    int b=myObj.nextInt();
    System.out.println("--options--:\n1.Add\n2.sub\n3.mul\n4.div\n5.mod\nEnter option:");
    int option=myObj.nextInt();
    switch (option) {
        case 1://addition
             int add=a+b;
             System.out.println("Sum of two number:"+add);
            break;
        case 2://subtraction
             int sub=a-b;
            System.out.println("Sub of two number:"+sub);
            break;
        case 3://multiplication
            int mul=a*b;
            System.out.println("Mul of two number:"+mul);
            break;
        case 4://division
            int div=a/b;
            System.out.println("Div of two number:"+div);
            break;
        case 5://modulus
            int mod=a%b;
            System.out.println("Mod of two number:"+mod);
            break;
        default:
            System.out.println("Enter valid number");
            break;
    }
}   
}