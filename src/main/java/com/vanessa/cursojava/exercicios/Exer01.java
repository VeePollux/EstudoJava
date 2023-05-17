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
public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculora de peso ideal de acordo com IMC\nDigite a altura:");
        Double altura = scan.nextDouble();
        System.out.println("Digite F para sexo feminino e M para masculino.");
        String sexo = scan.next();
        double resultado = 0;
        if(sexo.equals("F")){
            resultado = (72.7*altura) - 58;
        }
        if(sexo.equals("M")){
            resultado = (62.1*altura) - 44.7;
        }
        System.out.println("Digite um peso: ");
        Double peso = scan.nextDouble();
        System.out.println("Resultado: " + resultado);
        if(peso == resultado){
            System.out.println("Está no peso ideal");}
        else{
            System.out.println("Não está no peso ideal");
        }
        }
}
