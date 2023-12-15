/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perfectnumbers;
import java.util.Scanner;
/**
 *
 * @author Hasan
 */
public class PerfectNumbers {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter number: ");
        num = myObj.nextInt();
        for(int i = 1; i <num; i++){
            int mod = num%i;
            if( mod == 0){
                sum = sum +i;
            }
        }
       if(sum == num){
           System.out.println(num+ " is perfect number");
       }
       else{
           System.out.println(num + " is not perfect number");
       }
    }
}
