/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oppositetriangle;

import java.util.Scanner;

/**
 *
 * @author Hasan
 */
public class OppositeTriangle {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int num;
        Scanner triangle = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = triangle.nextInt();
        for(int k = num; k>=0; k--){
            for(int i=0; i<(num-k); i++){
            System.out.print(" ");}
            for(int j= 0; j<(2*k+1); j++){
                System.out.print("*");
            }
            System.out.println(" ");
                
                
        }
    }
}
