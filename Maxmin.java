/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maxmin;
import java.util.Scanner;
/**
 *
 * @author Hasan
 */
public class Maxmin {

    public static void main(String[] args) {
        int num,num1, max, min;
        Scanner myObj = new Scanner(System.in);
        System.out.print("How many numbers should be entered?: ");
        num = myObj.nextInt();
        System.out.print("Enter 1.number: ");
        num1 = myObj.nextInt();
        max = num1;
        min = num1;
        for(int i =1 ; i<num; i++ ){
            System.out.println("Enter " + (i+1) + (".") + "number: ");
            num1 = myObj.nextInt();
            if(max <= num1){
                max = num1;
            }
            if(min>=num1){
                min = num1;
            }
            
            
        }
        System.out.println("Max değer: " + max);
        System.out.println("Min değer:" + min);
    }
}
