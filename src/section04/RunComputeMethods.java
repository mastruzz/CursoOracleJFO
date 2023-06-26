package section04;

import java.util.Scanner;

public class RunComputeMethods {
    public static void main(String[] args) {

        ComputeMethods cm = new ComputeMethods();

        Scanner scanner = new Scanner(System.in);

       System.out.println("Temp in celsius is " + cm.fToC(100));

        System.out.println("Hypotenuse is " + cm.hypotenuse(5,5));

         System.out.println("The sum of the dice values is " + cm.roll());

         scanner.close();

    }
}