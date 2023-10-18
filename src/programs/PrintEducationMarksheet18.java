package programs;

import java.util.Scanner;

public class PrintEducationMarksheet18 {

    public static void main(String[] args) {

        int n, total = 0, percentage;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Student name : ");
        String name = scn.next();

        System.out.println("Enter no. of subject : ");
        n = scn.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100 :");
        for(int i = 0; i < n; i++)
        {
            marks[i] = scn.nextInt();
            total = total + marks[i];
        }
        percentage = total / n;
        System.out.println("The total mark : "+total);
        System.out.println("The percentage : "+percentage);

        // calculating grade
        if(percentage > 80){
            System.out.println("pass");
        }
        else
        {
            System.out.println("Fail");
        }

    }
}
