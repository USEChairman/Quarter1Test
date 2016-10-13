/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartertest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Eric Carlson
 */
public class QuarterTest {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number greater than 0.");
        int n = reader.nextInt();

        for (int i = 1; i < n + 1; i++) {
            System.out.println(i);
        }

        System.out.println("Enter another number.");
        int y = reader.nextInt();

        List myList = new ArrayList();

        if (y > 0) {
            
        }

        double result = MathFunctions.SquareRootAndAddThree(y);
        System.out.println(result);

    }

}
