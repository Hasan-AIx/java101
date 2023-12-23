/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
import javax.swing.JOptionPane;
/**
 *
 * @author Hasan
 */
public class CalculatorClass {
    
    static int plus(int num_1, int num_2){
        int var_Plus = (num_1 + num_2);
        return var_Plus;
    }
    static int minus(int num_1, int num_2){
        int var_Minus = (num_1 - num_2);
        return var_Minus;
}
    static int times(int num_1, int num_2){
        int var_Times = (num_1 * num_2);
        return var_Times;
    }
    static int div(int num_1, int num_2){
        int var_Div;
        do{
        var_Div = (num_1 / num_2);
        if(var_Div==0){
            JOptionPane.showMessageDialog(null, "Undefinable: Denominator cannot be 0" );
        }
        }while(num_2==0);
        return var_Div;
    }
    static int power(int base,int exp){
        if(exp==0){
            return 1;
        }
        else{
            return (base*power(base, exp-1));
        }
    }
    static int mod(int num_1, int num_2){
        int var_Mod;
        var_Mod = num_1 % num_2;
        return var_Mod;
    }
    
    static int fact(int num){
        if(num==0){
            return 1;
        }
        else{
        return num*fact(num-1);
        }
    }
}