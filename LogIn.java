/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.log.in;

import java.util.Scanner;

/**
 *
 * @author Hasan
 */
public class LogIn {

     public static void main(String[] args) {
        String name,password;
        Scanner kg = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = kg.next();
        System.out.println("Enter password: ");
        password = kg.next();
        
        if (name.equals("Hasan") && password.equals("hasan")){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong name or password ");
        }        
            
        
}
}