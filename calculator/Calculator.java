/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;
import javax.swing.JOptionPane;
/**
 *
 * @author Hasan
 */
public class Calculator {

    public static void main(String[] args) {
        String select,select_Add_1,select_Add_2,select_Sub_1,select_Sub_2,select_Mult_1,select_Mult_2,select_Div_1,select_Div_2,select_Exp_1,select_Exp_2,select_Fact_1,select_Mod_1,select_Mod_2;
        int select_Num;
        
        do{
          select = JOptionPane.showInputDialog("Please select \n 0- Exit \n 1-Addition \n 2-Substraction \n 3-Multiplication \n 4-Division \n 5-Exponentation \n 6-Factoial \n 7- Mod");
          select_Num = Integer.parseInt(select);
          switch(select_Num){
              case 0: 
                  break;
              case 1:
                  select_Add_1 = JOptionPane.showInputDialog("Enter first number:  "  );
                  int select_Add_1_int = Integer.parseInt(select_Add_1);
                  select_Add_2 = JOptionPane.showInputDialog("Enter second number:  " );
                  int select_Add_2_int = Integer.parseInt(select_Add_2);
                  JOptionPane.showMessageDialog(null, CalculatorClass.plus(select_Add_1_int,select_Add_2_int));
                  break;
              case 2:
                  select_Sub_1 = JOptionPane.showInputDialog("Enter first number:  " );
                  int select_Sub_1_int = Integer.parseInt(select_Sub_1);
                  select_Sub_2 = JOptionPane.showInputDialog("Enter second number:  "  );
                  int select_Sub_2_int = Integer.parseInt(select_Sub_2);
                  JOptionPane.showMessageDialog(null, CalculatorClass.minus(select_Sub_1_int,select_Sub_2_int));
                  break;
              case 3:
                  select_Mult_1 = JOptionPane.showInputDialog("Enter first number:  "  );
                  int select_Mult_1_int = Integer.parseInt(select_Mult_1);
                  select_Mult_2 = JOptionPane.showInputDialog("Enter second number:  "  );
                  int select_Mult_2_int = Integer.parseInt(select_Mult_2);
                  JOptionPane.showMessageDialog(null, CalculatorClass.times(select_Mult_1_int,select_Mult_2_int));
                  break;
              case 4:
                  select_Div_1 = JOptionPane.showInputDialog("Enter numerator:  "  );
                  int select_Div_1_int = Integer.parseInt(select_Div_1);
                  select_Div_2 = JOptionPane.showInputDialog("Enter denominator:  "  );
                  int select_Div_2_int = Integer.parseInt(select_Div_2);
                  JOptionPane.showMessageDialog(null, CalculatorClass.div(select_Div_1_int,select_Div_2_int));
                  break;
              case 5:
                  select_Exp_1 = JOptionPane.showInputDialog("Enter base:  "  );
                  int select_Exp_1_int = Integer.parseInt(select_Exp_1);
                  select_Exp_2 = JOptionPane.showInputDialog("Enter pow:  "  );
                  int select_Exp_2_int = Integer.parseInt(select_Exp_2);
                  JOptionPane.showMessageDialog(null, CalculatorClass.power(select_Exp_1_int,select_Exp_2_int));
                  break;
              case 6:
                  select_Fact_1 = JOptionPane.showInputDialog("Enter number:  "  );
                  int select_Fact_1_int = Integer.parseInt(select_Fact_1);
                  JOptionPane.showMessageDialog(null, CalculatorClass.fact(select_Fact_1_int));
                  break;
              case 7:
                  select_Mod_1 = JOptionPane.showInputDialog("Enter first number:  "  );
                  int select_Mod_1_int = Integer.parseInt(select_Mod_1);
                  select_Mod_2 = JOptionPane.showInputDialog("Enter second number:  "  );
                  int select_Mod_2_int = Integer.parseInt(select_Mod_2);
                  JOptionPane.showMessageDialog(null, CalculatorClass.mod(select_Mod_1_int,select_Mod_2_int));
                  break;
                  
      }         
            }while(select_Num!=0);
        }
}