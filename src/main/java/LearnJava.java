/**
 * @author
 * @version
 * @param
 * @return
 * @see
 */

import java.util.ArrayList;
import java.security.*;
import java.util.Scanner;

public class LearnJava {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println(
                "Integer: " +  10 +
                " Double: " + 3.14 +
                " Boolean: " + true);

        System.out.printf("pi = %.5f", Math.PI);

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        byte numByte = scanner.nextByte();

        int numInt = scanner.nextInt();

        float numFloat = scanner.nextFloat();

        double numDouble = scanner.nextDouble();

        boolean bool = scanner.nextBoolean();


    }
}