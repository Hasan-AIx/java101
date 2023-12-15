/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;
import java.util.Scanner;
/**
 *
 * @author Hasan
 */
public class Fibonacci {

    public static void main(String[] args) {
        int num, sum;
        Scanner fibonacci = new Scanner(System.in);
        System.out.println("Enter number");
        num = fibonacci.nextInt();
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        
        for(int i = 1; i<=num;i++){
            
            sum = first + second;
            first = second;
            second = sum;
            System.out.println(sum);
        }
        
    }
}
