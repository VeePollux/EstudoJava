/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vanessa.cursojava.exercicios;
import java.util.Scanner;

/**
 *
 * @author aldri
 */
public class Exer03 {
    public static void main(String[] args) {
        String output;
        int products;
        double price;
        double total;
        double paid;
        double over;
        Scanner scan = new Scanner(System.in);
        System.out.println("Fazer as compras? S/N");
        String exit = scan.next();
        while(exit.equalsIgnoreCase("S")){
            output = "Lojas XX\n";
            System.out.println("Digite a quantidade de produtos: ");
            products = scan.nextInt();
            total = 0;
            for(int i = 1; i<=products;i++){
                System.out.println("Informe o preço do produto " + i + ":");
                price = scan.nextDouble();
                output += "Produto " + i + ": R$ " + price + "\n";
                total += price;}
            output += "Total: R$" + total + "\n";
            System.out.println("Entre com o valor pago: ");
            paid = scan.nextDouble();
            output += "Dinheiro: R$ " + paid + "\n";
            over = paid - total;
            output += "Troco: R$ " + over ;
            System.out.println(output);
            System.out.println("Fazer as compras? S/N");
            exit = scan.next();
            }
}}
