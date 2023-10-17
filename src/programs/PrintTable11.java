package programs;

import java.util.Scanner;

public class PrintTable11 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); //declared scanner class
        System.out.println("Input a Number :"); //print statement
        int num=sc.nextInt();
        System.out.println("Expected Output :");
        int i;//reading a number whose table is to be print
        for(i=1;i<=10;i++)
        {
            System.out.println(num+"X"+i+"="+num*i); // printing statement with logic
        }
    }
}
