/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumbers;

import java.util.Scanner;

/**
 *
 * @author Hasan
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        prime();
    }
    
    
    public static void prime(){
        int num;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = myObj.nextInt();
        for (int i = 2; i <= num; i++) {
            boolean prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(i);
            
        }
        }
}
}