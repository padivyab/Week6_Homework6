package programs;


import java.util.Scanner;

public class InputTwoNumber10 {
    public static void main(String[] args) {

        //int num1=25;
        //int num2=5;
        Scanner sc= new Scanner(System.in);

        System.out.println("Input first Number:");
        int num1 = sc.nextInt();

        System.out.println("Input Second Number:");
        int num2 = sc.nextInt();

        System.out.println("Expected Output:" +(num1 + "X" + num2 + "=" + num1 * num2));
        //System.out.println("Expected Output:"+(num1 * num2));


    }
}
