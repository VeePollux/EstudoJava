/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vanessa.cursojava.aulas;

/**
 *
 * @author aldri
 */

public class Variaveis {

    public static void main(String[] args) {
        
       boolean sinal = true;
       byte idade01 = 20;
       short idade02 = 20;
       int idade03 = 20;    
       long idade04 = 20l;
        
       float preco1 = 28.90f;
       double preco2 = 28.90;
       double preco3 = 28.91e-1;
       
       char o = 'o';
       char i = 'i';
       
       System.out.println("Sinal: " + sinal);
        
       System.out.println("Idade 01: " + idade01 + "\nIdade 02: " + idade02 +  "\nIdade 03: " + idade03 + "\nIdade 04: " + idade04 + "\nPreço float: " + preco1 + "\nPreço double: " + preco2 + "\nPreço double 2: " + preco3);
       
       System.out.println("" + o);
       System.out.println(o);       
       System.out.println(o + i);     
       System.out.println("" + o + i);
       
       o = 111;
       i = 105;
       
       System.out.println("" + o);
       System.out.println(o);  
       System.out.println(o + i); 
       System.out.println("" + o + i);
       
       int var1 = 2147483647; //valor maximo int -> -2147483648 a 2147483647 (roleta)
       int var2 = 1;
       System.out.println(var1 + var2);
       
    }
}
