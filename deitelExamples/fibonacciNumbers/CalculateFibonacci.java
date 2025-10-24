/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacciNumbers;

/**
 *
 * @author arif
 */

import java.util.Scanner;

public class CalculateFibonacci {
    
    public static int getFibonacci(int ord) {
        int[] fibArr = new int[ord];
        if ((ord == 1) || (ord == 2))
            return 1;
        fibArr[0] = fibArr[1] = 1;
        for (int i=2; i < ord; i++) {
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
        }
        return fibArr[ord-1];
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int order = 0;
        while (true) {
            System.out.println("Enter the order of the fibonacci number:");
            try {
                order = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Input is not a number. Please enter another number:\n");
            }
            break;
        }
        System.out.printf("%dth fibonacci number is %d\n", order, getFibonacci(order));
        
    }
    
}
