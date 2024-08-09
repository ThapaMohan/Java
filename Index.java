//take input
package basic;
import java.util.Scanner;
public class Index {
    public static void main(String[] args){
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter the name");
        String name = myObj.nextLine();
        System.out.println("Enter age");   
        int age= myObj.nextInt();
        System.out.println("Hi "+name+ "! your age is "+age);
    }
}