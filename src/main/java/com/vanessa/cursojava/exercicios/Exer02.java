/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vanessa.cursojava.exercicios;

/**
 *
 * @author aldri
 */
import java.util.Scanner;
public class Exer02 {
        public static void main(String[] args) {
            int count = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Programa caixa eletrônico.Notas disponíveis: 1, 5, 10, 50 e 100.\nDigite um valor: ");
            int valor = scan.nextInt();
            if((valor/100)!=0){
                count = valor/100;
                valor = valor -100*count;
                System.out.println("Notas de 100: " + count);
                count = 0;}
            if((valor/50)!=0){
                    count = valor/50;
                    valor = valor - 50*count;
                    System.out.println("Notas de 50: " + count);
                    count = 0;}
            if((valor/10)!=0){
                count = valor/10;
                valor = valor -10*count;
                System.out.println("Notas de 10: " + count);
                count = 0;}
            if((valor/5)!=0){
                count = valor/5;
                valor = valor -5*count;
                System.out.println("Notas de 5: " + count);
                count = 0;}
            if((valor/1)!=0){
                count = valor/1;
                valor = valor -1*count;
                System.out.println("Notas de 1: " + count);}
        }   
}
