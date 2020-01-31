/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author rafa_
 */
public class Calculos {
    
   public static double adicao (double n1 , double n2){
        double resp;
        return resp=n1+n2;
    }
   public static double subtracao (double n1 , double n2){
        double resp;
        return resp=n1-n2;
    }
   public static double Multiplicacao (double n1 , double n2){
        double resp;
        return resp=n1*n2;
    }
   public static double Divisao (double n1 , double n2){
        double resp = 0;
        if ( n1 == 0 || n2 ==0 )
            System.out.println("Erro");
        else  resp=n1/n2;
        return resp;
    }
   
   public String DoubleConverteString ( double n1){
       String resp = String.format("%S", n1);
       return resp;
   }
   public double StringConverteDouble (JTextField str){
       String resp = String.valueOf(str);
       double n1 = Double.parseDouble(resp);
       return n1;
   }
  public static String Calcular (JTextField str1 ,JTextField str2,JComboBox c){
       Calculos Calculos = new Calculos();
       double op1=0,op2=0;
       op1 = Double.parseDouble(str1.getText());
       op2= Double.parseDouble(str2.getText());
       double resp=0;
       String str = null;
       if (c.getSelectedItem().equals("+")){
           resp =Calculos.adicao(op1, op2);
           System.err.println(resp);
       }else if (c.getSelectedItem().equals("-")){
           resp =Calculos.subtracao(op1, op2);
           System.err.println(resp);
       }else if (c.getSelectedItem().equals("*")){
           resp =Calculos.Multiplicacao(op1, op2);
           System.err.println(resp);
       }else if (c.getSelectedItem().equals("/")){
           resp =Calculos.Divisao(op1, op2);
           System.err.println(resp);
       }
       str= Calculos.DoubleConverteString( resp);
       return str;
   }
}
