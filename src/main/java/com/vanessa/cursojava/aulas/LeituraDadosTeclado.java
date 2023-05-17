/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vanessa.cursojava.aulas;


/**
 *
 * @author aldri
 */
import java.util.Scanner;
public class LeituraDadosTeclado {
   public static void main(String[] args) {
       
   Scanner scan = new Scanner(System.in);
   System.out.println("Digite seu nome: ");
   String nomeCompleto = scan.nextLine();
   System.out.println("Seu nome é " + nomeCompleto);
   
   System.out.println("Digite seu nome: ");
   String primeiroNome = scan.next();
   System.out.println("Seu nome é " + primeiroNome);
   
   System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bicho de estimação.");
   String nome = scan.next();
   int idade = scan.nextInt();
   byte filhos = scan.nextByte();
   float altura = scan.nextFloat();
   boolean pet = scan.nextBoolean();
   System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nFilhos: " + filhos + "\nAltura: "+ altura + "\nPet: " + pet);
  // usar virgula em altura pois a linguagem do pc está em PTBR
    }
}
